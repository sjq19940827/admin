package com.admin.controller;

import com.admin.pojo.TReduce;
import com.admin.service.TReduceService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TReduce)表控制层
 *
 * @author makejava
 * @since 2018-12-21 15:29:37
 */
@RestController
@RequestMapping("tReduce")
public class TReduceController {
    /**
     * 服务对象
     */
    @Resource
    private TReduceService tReduceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public String selectOne(Integer id) {
        TReduce tReduce = this.tReduceService.queryById(id);
        return JSON.toJSONString(tReduce);
    }


    @GetMapping("selectbyname")
    public String selectOnebyname(String reducetot) {
        TReduce tReduce = tReduceService.queryByName(reducetot);
        System.out.println(JSON.toJSONString(tReduce));
        return JSON.toJSONString(tReduce);
    }

    @GetMapping("getall")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TReduce> tReduces = tReduceService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",15);
        obj.put("data",tReduces);
        return obj.toJSONString();
    }

    @GetMapping("del")
    public String del(@RequestParam("reduceId") Integer reduceId){
        String s = tReduceService.deleteById(reduceId);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert( TReduce tReduce){
        TReduce insert = tReduceService.insert(tReduce);
        return JSON.toJSONString(insert);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update( TReduce tReduce){
        String insert = tReduceService.update(tReduce);
        return insert;
    }
}