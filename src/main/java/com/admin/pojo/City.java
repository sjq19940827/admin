package com.admin.pojo;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2018-12-21 10:24:54
 */

public class City implements Serializable {
    private static final long serialVersionUID = -89937718939030256L;
    
    private Integer cityId;
    
    private String cityName;
    
    private Integer count;
    
    private String areainfoId;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getAreainfoId() {
        return areainfoId;
    }

    public void setAreainfoId(String areainfoId) {
        this.areainfoId = areainfoId;
    }

}