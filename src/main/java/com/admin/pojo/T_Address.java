package com.admin.pojo;


import java.io.Serializable;

public class T_Address implements Serializable {

  private Long address_Id;
  private Long user_Id;
  private String address_Alias;
  private String address_Addressee;
  private String phone;
  private String tele_Phone;
  private String province_Id;
  private String city_Id;
  private String area_Id;
  private String detailed;
  private Long preferred;

  public Long getAddress_Id() {
    return this.address_Id;
  }

  public void setAddress_Id(final Long address_Id) {
    this.address_Id = address_Id;
  }

  public Long getUser_Id() {
    return this.user_Id;
  }

  public void setUser_Id(final Long user_Id) {
    this.user_Id = user_Id;
  }

  public String getAddress_Alias() {
    return this.address_Alias;
  }

  public void setAddress_Alias(final String address_Alias) {
    this.address_Alias = address_Alias;
  }

  public String getAddress_Addressee() {
    return this.address_Addressee;
  }

  public void setAddress_Addressee(final String address_Addressee) {
    this.address_Addressee = address_Addressee;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(final String phone) {
    this.phone = phone;
  }

  public String getTele_Phone() {
    return this.tele_Phone;
  }

  public void setTele_Phone(final String tele_Phone) {
    this.tele_Phone = tele_Phone;
  }

  public String getProvince_Id() {
    return this.province_Id;
  }

  public void setProvince_Id(final String province_Id) {
    this.province_Id = province_Id;
  }

  public String getCity_Id() {
    return this.city_Id;
  }

  public void setCity_Id(final String city_Id) {
    this.city_Id = city_Id;
  }

  public String getArea_Id() {
    return this.area_Id;
  }

  public void setArea_Id(final String area_Id) {
    this.area_Id = area_Id;
  }

  public String getDetailed() {
    return this.detailed;
  }

  public void setDetailed(final String detailed) {
    this.detailed = detailed;
  }

  public Long getPreferred() {
    return this.preferred;
  }

  public void setPreferred(final Long preferred) {
    this.preferred = preferred;
  }
}
