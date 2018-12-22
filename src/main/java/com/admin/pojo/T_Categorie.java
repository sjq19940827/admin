package com.admin.pojo;

import java.io.Serializable;

/**
 * (T_Categorie)实体类
 *
 * @author makejava
 * @since 2018-12-20 16:32:03
 */
public class T_Categorie implements Serializable {
    private static final long serialVersionUID = -64997600935744593L;
    
    private Long categorie_Id;
    
    private String categorie_Name;
    
    private String categorie_Shorthand;

    public static long getSerialVersionUID() {
        return T_Categorie.serialVersionUID;
    }

    public Long getCategorie_Id() {
        return this.categorie_Id;
    }

    public void setCategorie_Id(final Long categorie_Id) {
        this.categorie_Id = categorie_Id;
    }

    public String getCategorie_Name() {
        return this.categorie_Name;
    }

    public void setCategorie_Name(final String categorie_Name) {
        this.categorie_Name = categorie_Name;
    }

    public String getCategorie_Shorthand() {
        return this.categorie_Shorthand;
    }

    public void setCategorie_Shorthand(final String categorie_Shorthand) {
        this.categorie_Shorthand = categorie_Shorthand;
    }
}