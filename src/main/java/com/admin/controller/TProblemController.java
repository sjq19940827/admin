package com.admin.controller;

import com.admin.pojo.TProblem;
import com.admin.service.TProblemService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TProblem)表控制层
 *
 * @author makejava
 * @since 2018-12-24 11:19:36
 */
@RestController
@RequestMapping("tProblem")
@Api(value = "tProblem/",description = "常见问题管理")
public class TProblemController {
    /**
     * 服务对象
     */
    @Resource
    private TProblemService tProblemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TProblem selectOne(Integer id) {
        return this.tProblemService.queryById(id);
    }


    @GetMapping("selectbyname")
    @ApiOperation(value = "根据问题名称查询",notes = "常见问题json数组")
    public String selectOnebyname(String title) {
        return JSON.toJSONString(this.tProblemService.queryByTitle(title));
    }

    @GetMapping("getall")
    @ApiOperation(value = "分页查询全部问题",notes = "常见问题json数组")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TProblem> tProblems = tProblemService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",20);
        obj.put("data",tProblems);
        return obj.toJSONString();
    }

    @GetMapping("del")
    @ApiOperation(value = "删除问题信息",notes = "相应结果")
    public String del(@ApiParam(required = true, name ="问题ID", value ="qid") @RequestParam("qid") Integer qid){
        String s = tProblemService.deleteById(qid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "新增问题信息",notes = "相应结果")
    public String insert(@RequestBody TProblem tProblem){
        String insert = tProblemService.insert(tProblem);
        return insert;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "修改问题信息",notes = "相应结果")
    public String update(@ApiParam(required = true, name ="问题对象", value ="tproblem") @RequestBody TProblem tProblem){
        String insert = tProblemService.update(tProblem);
        return insert;
    }
}