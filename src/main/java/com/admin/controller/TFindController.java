package com.admin.controller;

import com.admin.pojo.TFind;
import com.admin.service.TFindService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TFind)表控制层
 *
 * @author makejava
 * @since 2018-12-21 20:25:47
 */
@RestController
@RequestMapping("tFind")
public class TFindController {
    /**
     * 服务对象
     */
    @Resource
    private TFindService tFindService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public String selectOne(Integer id) {
        return JSON.toJSONString(this.tFindService.queryById(id));
    }

    @GetMapping("userid")
    public String selectOnebyname(Integer userid) {
        return JSON.toJSONString(this.tFindService.queryByUserId(userid));
    }

    @GetMapping("getall")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TFind> tFinds = tFindService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",20);
        obj.put("data",tFinds);
        return obj.toJSONString();
    }

    @GetMapping("del")
    public String del(@RequestParam("findid") Integer findid){
        String s = tFindService.deleteById(findid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert( TFind tFind){
        String insert = tFindService.insert(tFind);
        return insert;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update( TFind tFind){
        String insert = tFindService.update(tFind);
        return insert;
    }
}