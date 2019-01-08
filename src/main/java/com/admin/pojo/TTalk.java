package com.admin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (TTalk)实体类
 *
 * @author makejava
 * @since 2018-12-22 11:30:36
 */
public class TTalk implements Serializable {
    private static final long serialVersionUID = -68181604762818877L;
    
    private Integer talkId;
    
    private Long answerId;
    
    private Integer userId;
    
    private String talkInfo;
    
    private Integer state;
    
    private Integer praseCount;
    
    private Date createtime;

    private List<T_Show> tShows=new ArrayList<T_Show>();

    private List<T_User> tUsers = new ArrayList<T_User>();

    public List<T_Show> gettShows() {
        return this.tShows;
    }

    public void settShows(final List<T_Show> tShows) {
        this.tShows = tShows;
    }

    public List<T_User> gettUsers() {
        return this.tUsers;
    }

    public void settUsers(final List<T_User> tUsers) {
        this.tUsers = tUsers;
    }

    public Integer getTalkId() {
        return talkId;
    }

    public void setTalkId(Integer talkId) {
        this.talkId = talkId;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTalkInfo() {
        return talkInfo;
    }

    public void setTalkInfo(String talkInfo) {
        this.talkInfo = talkInfo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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