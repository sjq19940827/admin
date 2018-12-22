package com.admin.controller;

import com.admin.pojo.TFind;
import com.admin.service.TFindService;
import io.swagger.annotations.Api;
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
    public TFind selectOne(Integer id) {
        return this.tFindService.queryById(id);
    }

    @GetMapping("userid")
    public TFind selectOnebyname(Integer userid) {
        return this.tFindService.queryByUserId(userid);
    }
}