package com.admin.controller;

import com.admin.pojo.City;
import com.admin.service.CityService;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (City)表控制层
 *
 * @author makejava
 * @since 2018-12-21 10:24:57
 */
@RestController
@RequestMapping("city")
@Api(value = "city/",description = "城市管理")
public class CityController {
    /**
     * 服务对象
     */
    @Resource
    private CityService cityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectbyid")
    public City selectOne(Integer id) {
        return this.cityService.queryById(id);
    }
    @GetMapping("selectbyname")
    public City selectOnebyname(String cityname) {
        return this.cityService.queryByName(cityname);
    }


    @GetMapping("getall")
    @ApiOperation(value = "分页查询全部城市",notes = "城市信息")
    public String getall(@RequestParam("pagenum")int pagenum , @RequestParam("pagesize") int pagesize){
        String s = cityService.queryAllByLimit(pagenum, pagesize);
        return s;
    }

    @GetMapping("del")
    @ApiOperation(value = "删除商品信息",notes = "相应结果")
    public String del(@ApiParam(required = true, name ="cityid", value ="城市ID") @RequestParam("cityid") Integer cityid){
        String s = cityService.deleteById(cityid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增城市信息",notes = "相应结果")
    public String insert(@RequestBody City city){
        City insert = cityService.insert(city);
        return JSON.toJSONString(insert);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "修改城市信息",notes = "相应结果")
    public String update(@RequestBody City city){
        String insert = cityService.update(city);
        return insert;
    }
}