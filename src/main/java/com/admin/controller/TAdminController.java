package com.admin.controller;

import com.admin.pojo.City;
import com.admin.pojo.TAdmin;
import com.admin.pojo.TProblem;
import com.admin.service.TAdminService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TAdmin)表控制层
 *
 * @author makejava
 * @since 2018-12-24 14:51:35
 */
@RestController
@RequestMapping("tAdmin")
public class TAdminController {
    /**
     * 服务对象
     */
    @Resource
    private TAdminService tAdminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TAdmin selectOne(Integer id) {
        return this.tAdminService.queryById(id);
    }


    @GetMapping("login")
    public String login(@RequestParam("addountnumber")String addountnumber, @RequestParam("password")String password){
        String s = tAdminService.login(addountnumber, password);
        return s;
    }

    @GetMapping("getall")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TAdmin> tAdmins = tAdminService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",20);
        obj.put("data",tAdmins);
        return obj.toJSONString();
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(TAdmin tAdmin){
        String insert = tAdminService.update(tAdmin);
        return insert;
    }
    @GetMapping("del")
    public String del(@RequestParam("aid") Integer aid){
        String s = tAdminService.deleteById(aid);
        return s;
    }


    @RequestMapping(value = "updatemark",method = RequestMethod.POST)
    public String updatemark(@RequestParam("adminid")int adminid,
                             @RequestParam("adminmark") int adminmark){
            String i = tAdminService.updatemark(adminid,adminmark);
        return i;
    }


    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(TAdmin tAdmin){
        String insert = tAdminService.insert(tAdmin);
        return insert;
    }
}