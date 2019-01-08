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
    public TTalk selecttalk(Integer id) {
        return this.tTalkService.queryById(id);
    }

    /**
     * 根据用户ID查询回复
     * @param userid
     * @return
     */
    @GetMapping("selectrebyuserid")
    public TReplytalk selectreplybyuserid(Integer userid){
        return tReplytalkService.queryByUserId(userid);
    }
    /**
     * 根据用户ID查询回复
     * @param userid
     * @return
     */
    @GetMapping("selectbyuserid")
    public TTalk selectbyuserid(Integer userid){
        return tTalkService.queryByUserId(userid);
    }

    @GetMapping("getalltalk")
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
    public String deltalk(@RequestParam("talkid") Integer talkid){
        String s = tTalkService.deleteById(talkid);
        return s;
    }
    @GetMapping("delreply")
    public String delreply(@RequestParam("replyid") Integer replyid){
        String s = tReplytalkService.deleteById(replyid);
        return s;
    }

}