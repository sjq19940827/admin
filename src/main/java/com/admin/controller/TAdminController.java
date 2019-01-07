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
@Api(value = "tAdmin/",description = "管理员管理")
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
    @ApiOperation(value = "登录",notes = "相应返回结果")
    public String login(@RequestParam("addountnumber")String addountnumber, @RequestParam("password")String password){
        String s = tAdminService.login(addountnumber, password);
        return s;
    }

    @GetMapping("getall")
    @ApiOperation(value = "分页显示全部管理员信息",httpMethod = "GET",notes = "订单json数组")
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
    @ApiOperation(value = "修改管理员信息",notes = "相应结果")
    public String update(@ApiParam(required = true, name ="管理员对象", value ="tadmin") @RequestBody TAdmin tAdmin){
        String insert = tAdminService.update(tAdmin);
        return insert;
    }
    @GetMapping("del")
    @ApiOperation(value = "删除管理员信息",notes = "相应结果")
    public String del(@ApiParam(required = true, name ="管理员ID", value ="aid") @RequestParam("aid") Integer aid){
        String s = tAdminService.deleteById(aid);
        return s;
    }


    @RequestMapping(value = "updatemark",method = RequestMethod.POST)
    @ApiOperation(value = "修改管理员权限",notes = "相应结果")
    public String updatemark(@ApiParam(required = true, name ="管理员ID", value ="adminid") @RequestParam("adminid")int adminid,
                             @ApiParam(required = true, name ="管理员权限标记", value ="adminmark") @RequestParam("adminmark") int adminmark){
        String i = tAdminService.updatemark(adminid,adminmark);
        return i;
    }


    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增管理员",notes = "相应结果")
    public String insert(@RequestBody TAdmin tAdmin){
        String insert = tAdminService.insert(tAdmin);
        return insert;
    }
}