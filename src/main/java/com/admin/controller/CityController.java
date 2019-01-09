package com.admin.controller;

import com.admin.pojo.City;
import com.admin.service.CityService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
    public String selectOne(Integer id) {
        return JSON.toJSONString(this.cityService.queryById(id));
    }
    @GetMapping("selectbyname")
    public String selectOnebyname(String cityname) {
        return JSON.toJSONString(this.cityService.queryByName(cityname));
    }

    @GetMapping("getall")
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
    public String del(@RequestParam("cityid") Integer cityid){
        String s = cityService.deleteById(cityid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(City city){
        String insert = cityService.insert(city);
        return insert;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(City city){
        String insert = cityService.update(city);
        return insert;
    }
}