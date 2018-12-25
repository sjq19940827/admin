package com.admin.pojo;

import java.io.Serializable;

/**
 * (TAdmin)实体类
 *
 * @author makejava
 * @since 2018-12-24 14:51:27
 */
public class TAdmin implements Serializable {
    private static final long serialVersionUID = 805986676636137207L;
    //管理员ID
    private Integer adminId;
    //管理员名字
    private String adminName;
    //管理员密码
    private String adminPwd;
    //管理员昵称
    private String adminNickname;
    //管理员标记 1.超级管理员 2.商品管理员 3.客服管理员 4.信息管理员
    private Integer adminMark;
    //管理员手机号
    private String adminPhone;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname;
    }

    public Integer getAdminMark() {
        return adminMark;
    }

    public void setAdminMark(Integer adminMark) {
        this.adminMark = adminMark;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

}