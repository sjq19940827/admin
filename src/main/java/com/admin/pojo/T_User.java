package com.admin.pojo;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class T_User implements Serializable {

  private Integer id;
  private String userName;
  private String nickname;
  private String password;
  private Long sex;
  private String identityCode;
  private java.sql.Date userdate;
  private String loginName;
  private Integer usertype;
  private String imageName;
  private Double balance;
  private java.sql.Timestamp latelyLogin;
  private Long login_Phone;

  public Integer getId() {
    return this.id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  public String getNickname() {
    return this.nickname;
  }

  public void setNickname(final String nickname) {
    this.nickname = nickname;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public Long getSex() {
    return this.sex;
  }

  public void setSex(final Long sex) {
    this.sex = sex;
  }

  public String getIdentityCode() {
    return this.identityCode;
  }

  public void setIdentityCode(final String identityCode) {
    this.identityCode = identityCode;
  }

  public Date getUserdate() {
    return this.userdate;
  }

  public void setUserdate(final Date userdate) {
    this.userdate = userdate;
  }

  public String getLoginName() {
    return this.loginName;
  }

  public void setLoginName( String loginName) {
    this.loginName = loginName;
  }

  public Integer getUsertype() {
    return this.usertype;
  }

  public void setUsertype( Integer usertype) {
    this.usertype = usertype;
  }

  public String getImageName() {
    return this.imageName;
  }

  public void setImageName( String imageName) {
    this.imageName = imageName;
  }

  public Double getBalance() {
    return this.balance;
  }

  public void setBalance( Double balance) {
    this.balance = balance;
  }

  public Timestamp getLatelyLogin() {
    return this.latelyLogin;
  }

  public void setLatelyLogin(Timestamp latelyLogin) {
    this.latelyLogin = latelyLogin;
  }

  public Long getLogin_Phone() {
    return this.login_Phone;
  }

  public void setLogin_Phone( Long login_Phone) {
    this.login_Phone = login_Phone;
  }
}
