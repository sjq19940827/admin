package com.admin.controller;

import com.admin.pojo.TReduce;
import com.admin.pojo.City;
import com.admin.service.TReduceService;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TReduce)表控制层
 *
 * @author makejava
 * @since 2018-12-21 15:29:37
 */
@RestController
@RequestMapping("tReduce")
@Api(value = "tReduce/",description = "优惠券管理")
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
    @ApiOperation(value = "分页查询全部优惠券",notes = "优惠券信息")
    public String getall(@RequestParam("pagenum")int pagenum , @RequestParam("pagesize") int pagesize){
        String s = tReduceService.queryAllByLimit(pagenum, pagesize);
        return s;
    }

    @GetMapping("del")
    @ApiOperation(value = "删除优惠券信息",notes = "相应结果")
    public String del(@ApiParam(required = true, name ="reduceId", value ="优惠券ID") @RequestParam("reduceId") Integer reduceId){
        String s = tReduceService.deleteById(reduceId);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增优惠券信息",notes = "相应结果")
    public String insert(@RequestBody TReduce tReduce){
        TReduce insert = tReduceService.insert(tReduce);
        return JSON.toJSONString(insert);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "修改优惠券信息",notes = "相应结果")
    public String update( TReduce tReduce){
        String insert = tReduceService.update(tReduce);
        return insert;
    }
}