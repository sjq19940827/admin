package com.admin.controller;

import com.admin.pojo.T_Categorie;
import com.admin.service.TCategorieService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (T_Categorie)表控制层
 *
 * @author makejava
 * @since 2018-12-20 16:32:04
 */
@RestController
@RequestMapping("tCategorie/")
public class TCategorieController {
    /**
     * 服务对象
     */
    @Resource
    private TCategorieService tCategorieService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public T_Categorie selectOne(@RequestParam("id") Long id) {
        return this.tCategorieService.queryById(id);
    }

    @GetMapping("getall")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<T_Categorie> t_categories = tCategorieService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",20);
        obj.put("data",t_categories);
        return obj.toJSONString();
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(T_Categorie tCategorie){
        String update = tCategorieService.update(tCategorie);
        return update;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(@ApiParam(required = true, name ="tCategorie", value ="商品类型名称")T_Categorie tCategorie){
        String insert = tCategorieService.insert(tCategorie);
        return insert;
    }


    @GetMapping("del")
    public String del(@RequestParam("categorieid") long categorieid){
        String s = tCategorieService.deleteById(categorieid);
        return s;
    }

}