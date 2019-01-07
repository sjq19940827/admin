package com.admin.controller;

import com.admin.pojo.TReplytalk;
import com.admin.pojo.TTalk;
import com.admin.service.TReplytalkService;
import com.admin.service.TTalkService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TTalk)表控制层
 *
 * @author makejava
 * @since 2018-12-22 11:30:38
 */
@RestController
@RequestMapping("tTalk")
@Api(value = "tTalk/",description = "评论回复管理")
public class TTalkController {
    /**
     * 评论
     */
    @Resource
    private TTalkService tTalkService;

    /**
     * 回复
     */
    @Resource
    private TReplytalkService tReplytalkService;

    /**
     * 通过回复ID查找相应回复
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectbyretalkid")
    @ApiOperation(value = "根据回复Id查回复",notes = "回复对象")
    public TReplytalk selectreply(Integer id) {
        return this.tReplytalkService.queryById(id);
    }


    /**
     *  按照评论ID查询评论
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectbytalkid")
    @ApiOperation(value = "根据评论ID查评论",notes = "评论对象")
    public TTalk selecttalk(Integer id) {
        return this.tTalkService.queryById(id);
    }

    /**
     * 根据用户ID查询回复
     * @param userid
     * @return
     */
    @GetMapping("selectrebyuserid")
    @ApiOperation(value = "根据用户ID查回复",notes = "回复对象")
    public TReplytalk selectreplybyuserid(Integer userid){
        return tReplytalkService.queryByUserId(userid);
    }
    /**
     * 根据用户ID查询回复
     * @param userid
     * @return
     */
    @GetMapping("selectbyuserid")
    @ApiOperation(value = "根据用户ID查评论",notes = "评论对象")
    public TTalk selectbyuserid(Integer userid){
        return tTalkService.queryByUserId(userid);
    }

    @GetMapping("getalltalk")
    @ApiOperation(value = "分页查询全部评论",notes = "评论信息")
    public String getalltalk(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TTalk> tTalks = tTalkService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",100);
        obj.put("data",tTalks);
        return obj.toJSONString();
    }
    @GetMapping("getallreply")
    @ApiOperation(value = "分页查询全部回复",notes = "回复信息")
    public String getallreply(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TReplytalk> tReplytalks = tReplytalkService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",100);
        obj.put("data",tReplytalks);
        return obj.toJSONString();
    }

    @GetMapping("deltalk")
    @ApiOperation(value = "按评论ID删除评论信息",notes = "相应结果")
    public String deltalk(@ApiParam(required = true, name ="talkid", value ="评论ID") @RequestParam("talkid") Integer talkid){
        String s = tTalkService.deleteById(talkid);
        return s;
    }
    @GetMapping("delreply")
    @ApiOperation(value = "按回复ID删除回复信息",notes = "相应结果")
    public String delreply(@ApiParam(required = true, name ="replyid", value ="回复ID") @RequestParam("replyid") Integer replyid){
        String s = tReplytalkService.deleteById(replyid);
        return s;
    }

}