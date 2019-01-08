package com.admin.controller;

import com.admin.pojo.City;
import com.admin.service.CityService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
     * @return 单条数据z
     */
    @GetMapping("selectbyid")
    @ApiOperation(value = "根据城市ID查询",notes = "城市对象")
    public String selectOne(Integer id) {
        return JSON.toJSONString(this.cityService.queryById(id));
    }
    @GetMapping("selectbyname")
    @ApiOperation(value = "根据城市名称查询",notes = "城市对象")
    public String selectOnebyname(String cityname) {
        return JSON.toJSONString(this.cityService.queryByName(cityname));
    }

    @GetMapping("getall")
    @ApiOperation(value = "分页查询全部城市",notes = "城市信息")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<City> cities = cityService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",130);
        obj.put("data",cities);
        return obj.toJSONString();
//        jsoncode jsontojsonstring
    }

    @GetMapping("del")
    @ApiOperation(value = "删除商品信息",notes = "相应结果")
    public String del(@ApiParam(required = true, name ="cityid", value ="城市ID") @RequestParam("cityid") Integer cityid){
        String s = cityService.deleteById(cityid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增城市信息",notes = "相应结果")
    public String insert(City city){
        String insert = cityService.insert(city);
        return insert;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "修改城市信息",notes = "相应结果")
    public String update(@ApiParam(required = true, name ="city", value ="城市对象")City city){
        String insert = cityService.update(city);
        return insert;
    }
}