package com.admin.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TReduce)实体类
 *
 * @author makejava
 * @since 2018-12-21 15:29:37
 */
public class TReduce implements Serializable {
    private static final long serialVersionUID = -48586433764299952L;
    
    private Integer reduceId;
    
    private String reduceNumber;
    
    private String reduceTot;
    
    private String sub;
    
    private String purpose;
    
    private String valid;


    public Integer getReduceId() {
        return reduceId;
    }

    public void setReduceId(Integer reduceId) {
        this.reduceId = reduceId;
    }

    public String getReduceNumber() {
        return reduceNumber;
    }

    public void setReduceNumber(String reduceNumber) {
        this.reduceNumber = reduceNumber;
    }

    public String getReduceTot() {
        return reduceTot;
    }

    public void setReduceTot(String reduceTot) {
        this.reduceTot = reduceTot;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public static long getSerialVersionUID() {
        return TReduce.serialVersionUID;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(final String purpose) {
        this.purpose = purpose;
    }

    public String getValid() {
        return this.valid;
    }

    public void setValid(final String valid) {
        this.valid = valid;
    }
}