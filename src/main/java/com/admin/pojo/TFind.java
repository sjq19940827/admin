package com.admin.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TFind)实体类
 *
 * @author makejava
 * @since 2018-12-21 20:25:42
 */
public class TFind implements Serializable {
    private static final long serialVersionUID = 571938331284134551L;
    
    private Integer findId;
    
    private String information;
    
    private Long showId;
    
    private Integer userId;
    
    private String releasetime;


    public Integer getFindId() {
        return findId;
    }

    public void setFindId(Integer findId) {
        this.findId = findId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReleasetime() {
        return this.releasetime;
    }

    public void setReleasetime(final String releasetime) {
        this.releasetime = releasetime;
    }
}