package com.admin.pojo;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (T_Show)实体类
 *
 * @author makejava
 * @since 2018-12-19 19:27:26
 */
public class T_Show implements Serializable {
    private static final long serialVersionUID = -83285906858442450L;
    //主键，演出Id
    private Long show_Id;
    //演出名称
    private String show_Name;
    //演出图片
    private String show_Img;
    //最低票价票价
    private Object show_Min_Price;
    //演出地点
    private String show_Place;
    //外键，分类ID
    private Long categorie_Id;
    //外键，城市ID
    private Long areainfo_Id;
    //演出简介
    private String show_Title;
    
    private Integer count;
    //演出状态，1:项目待定，2:预定/预售，3:售票中,4:退票，5:演出开始
    private Long show_Status;
    
    private String show_Begin_Time;
    
    private String show_End_Time;
    //最高票价
    private Object show_Max_Price;
    //票数
    private Integer show_Ipt_Num;

    private Integer show_mark;

    private List<TTalk> tTalks;

    public List<TTalk> gettTalks() {
        return this.tTalks;
    }

    public void settTalks(final List<TTalk> tTalks) {
        this.tTalks = tTalks;
    }

    public static long getSerialVersionUID() {
        return T_Show.serialVersionUID;
    }

    public Long getShow_Id() {
        return this.show_Id;
    }

    public void setShow_Id(final Long show_Id) {
        this.show_Id = show_Id;
    }

    public String getShow_Name() {
        return this.show_Name;
    }

    public void setShow_Name(final String show_Name) {
        this.show_Name = show_Name;
    }

    public String getShow_Img() {
        return this.show_Img;
    }

    public void setShow_Img(final String show_Img) {
        this.show_Img = show_Img;
    }

    public Object getShow_Min_Price() {
        return this.show_Min_Price;
    }

    public void setShow_Min_Price(final Object show_Min_Price) {
        this.show_Min_Price = show_Min_Price;
    }

    public String getShow_Place() {
        return this.show_Place;
    }

    public void setShow_Place(final String show_Place) {
        this.show_Place = show_Place;
    }

    public Long getCategorie_Id() {
        return this.categorie_Id;
    }

    public void setCategorie_Id(final Long categorie_Id) {
        this.categorie_Id = categorie_Id;
    }

    public Long getAreainfo_Id() {
        return this.areainfo_Id;
    }

    public void setAreainfo_Id(final Long areainfo_Id) {
        this.areainfo_Id = areainfo_Id;
    }

    public String getShow_Title() {
        return this.show_Title;
    }

    public void setShow_Title(final String show_Title) {
        this.show_Title = show_Title;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public Long getShow_Status() {
        return this.show_Status;
    }

    public void setShow_Status(final Long show_Status) {
        this.show_Status = show_Status;
    }

    public String getShow_Begin_Time() {
        return this.show_Begin_Time;
    }

    public void setShow_Begin_Time(final String show_Begin_Time) {
        this.show_Begin_Time = show_Begin_Time;
    }

    public String getShow_End_Time() {
        return this.show_End_Time;
    }

    public void setShow_End_Time(final String show_End_Time) {
        this.show_End_Time = show_End_Time;
    }

    public Object getShow_Max_Price() {
        return this.show_Max_Price;
    }

    public void setShow_Max_Price(final Object show_Max_Price) {
        this.show_Max_Price = show_Max_Price;
    }

    public Integer getShow_Ipt_Num() {
        return this.show_Ipt_Num;
    }

    public void setShow_Ipt_Num(final Integer show_Ipt_Num) {
        this.show_Ipt_Num = show_Ipt_Num;
    }

    public Integer getShow_mark() {
        return this.show_mark;
    }

    public void setShow_mark(final Integer show_mark) {
        this.show_mark = show_mark;
    }
}