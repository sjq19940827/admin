package com.admin.controller;

import com.admin.pojo.T_Show;
import com.admin.service.TShowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * (T_Show)表控制层
 *
 * @author makejava
 * @since 2018-12-19 19:27:28
 */
@Controller
@RequestMapping("tShow/")
@Api(value = "tShow/",description = "商品管理")
public class TShowController {
    /**
     * 服务对象
     */
    @Resource
    private TShowService tShowService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")

    public String selectOne(Long id) {
        return this.tShowService.queryById(id);
    }
    @GetMapping("limit")
    @ApiOperation(value = "分页查询所有商品信息" , httpMethod = "GET", notes = "返回所有商品信息 数组")
    public String querybylimit(@RequestParam("pagenum") int pagenum,@RequestParam("pagesize") int pagesize) throws Exception{
        String s = tShowService.queryAllByLimit(pagenum, pagesize);
        return s;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "动态修改商品信息",notes = "返回商品对象json")
    public String update(@RequestBody T_Show t_show){
        String update = tShowService.update(t_show);
        return update;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增商品信息",httpMethod = "GET",notes = "相应结果")
    public String insert(@RequestBody T_Show t_show){
        String insert = tShowService.insert(t_show);
        return insert;
    }


    @GetMapping("del")
    @ApiOperation(value = "删除商品信息",httpMethod = "POST",notes = "相应结果")
    public String del(@RequestParam("showid") long showid){
        String s = tShowService.deleteById(showid);
        return s;
    }
}