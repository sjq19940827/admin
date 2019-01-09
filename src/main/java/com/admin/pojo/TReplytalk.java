package com.admin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (TReplytalk)实体类
 *
 * @author makejava
 * @since 2018-12-22 11:31:04
 */
public class TReplytalk implements Serializable {
    private static final long serialVersionUID = -90292027319435952L;
    
    private Integer replyId;
    
    private Integer replyuserId;
    
    private Integer talkId;
    
    private String replyInfo;
    
    private Integer praseCount;
    
    private Date createtime;

    private List<T_User> tUsers=new ArrayList<T_User>();

    private List<TTalk> tTalks=new ArrayList<TTalk>();

    public List<T_User> gettUsers() {
        return this.tUsers;
    }

    public void settUsers(final List<T_User> tUsers) {
        this.tUsers = tUsers;
    }

    public List<TTalk> gettTalks() {
        return this.tTalks;
    }

    public void settTalks(final List<TTalk> tTalks) {
        this.tTalks = tTalks;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyuserId() {
        return replyuserId;
    }

    public void setReplyuserId(Integer replyuserId) {
        this.replyuserId = replyuserId;
    }

    public Integer getTalkId() {
        return talkId;
    }

    public void setTalkId(Integer talkId) {
        this.talkId = talkId;
    }

    public String getReplyInfo() {
        return replyInfo;
    }

    public void setReplyInfo(String replyInfo) {
        this.replyInfo = replyInfo;
    }

    public Integer getPraseCount() {
        return praseCount;
    }

    public void setPraseCount(Integer praseCount) {
        this.praseCount = praseCount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}