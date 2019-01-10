package com.admin.controller;

import com.admin.pojo.TProblem;
import com.admin.service.TProblemService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
    public String selectOnebyname(String title) {
        return JSON.toJSONString(this.tProblemService.queryByTitle(title));
    }

    @GetMapping("getall")
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
    public String del(@RequestParam("qid") Integer qid){
        String s = tProblemService.deleteById(qid);
        return s;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert( TProblem tProblem){
        String insert = tProblemService.insert(tProblem);
        return insert;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update( TProblem tProblem){
        String insert = tProblemService.update(tProblem);
        return insert;
    }
}