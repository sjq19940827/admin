package com.admin.dao;

import com.admin.pojo.T_Categorie;

import java.util.List;

/**
 * (T_Categorie)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-20 16:32:04
 */
public interface TCategorieDao {

    /**
     * 通过ID查询单条数据
     *
     * @param categorieId 主键
     * @return 实例对象
     */
    T_Categorie queryById(Long categorieId);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<T_Categorie> getall();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tCategorie 实例对象
     * @return 对象列表
     */
    List<T_Categorie> queryAll(T_Categorie tCategorie);

    /**
     * 新增数据
     *
     * @param tCategorie 实例对象
     * @return 影响行数
     */
    int insert(T_Categorie tCategorie);

    /**
     * 修改数据
     *
     * @param tCategorie 实例对象
     * @return 影响行数
     */
    int update(T_Categorie tCategorie);

    /**
     * 通过主键删除数据
     *
     * @param categorieId 主键
     * @return 影响行数
     */
    int deleteById(Long categorieId);

}