package com.admin.controller;

import com.admin.pojo.TFind;
import com.admin.service.TFindService;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TFind)表控制层
 *
 * @author makejava
 * @since 2018-12-21 20:25:47
 */
@RestController
@RequestMapping("tFind")
@Api(value = "tFind/",description = "发现模块管理")
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
    @ApiOperation(value = "按照发现ID查询发现",notes = "发现对象")
    public String selectOne(Integer id) {
        return JSON.toJSONString(this.tFindService.queryById(id));
    }

    @GetMapping("userid")
    @ApiOperation(value = "按用户ID查询发现",notes = "发现对象")
    public String selectOnebyname(Integer userid) {
        return JSON.toJSONString(this.tFindService.queryByUserId(userid));
    }

    @GetMapping("getall")
    @ApiOperation(value = "分页查询全部发现",notes = "发现信息json数组")
    public String getall(@RequestParam("pagenum")int pagenum , @RequestParam("pagesize") int pagesize){
        String s = tFindService.queryAllByLimit(pagenum, pagesize);
        return s;
    }

    @GetMapping("del")
    @ApiOperation(value = "删除发现信息",notes = "相应结果")
    public String del(@ApiParam(required = true, name ="findid", value ="发现ID") @RequestParam("findid") Integer findid){
        String s = tFindService.deleteById(findid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增发现信息",notes = "相应结果")
    public String insert(@RequestBody TFind tFind){
        String insert = tFindService.insert(tFind);
        return insert;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "修改发现信息",notes = "相应结果")
    public String update(@RequestBody TFind tFind){
        String insert = tFindService.update(tFind);
        return insert;
    }
}