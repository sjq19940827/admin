package com.admin.pojo;

import java.io.Serializable;

/**
 * (TProblem)实体类
 *
 * @author makejava
 * @since 2018-12-24 11:19:34
 */
public class TProblem implements Serializable {
    private static final long serialVersionUID = 775559872541129130L;
    
    private Integer questionId;
    
    private String questionTitle;
    
    private String questionContent;


    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

}