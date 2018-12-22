package com.admin.service;

import com.admin.pojo.T_Categorie;

/**
 * (T_Categorie)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 16:32:04
 */
public interface TCategorieService {

    /**
     * 通过ID查询单条数据
     *
     * @param categorieId 主键
     * @return 实例对象
     */
    T_Categorie queryById(Long categorieId);

    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    String queryAllByLimit(int pagenum, int pagesize);

    /**
     * 新增数据
     *
     * @param tCategorie 实例对象
     * @return 实例对象
     */
    String insert(T_Categorie tCategorie);

    /**
     * 修改数据
     *
     * @param tCategorie 实例对象
     * @return 实例对象
     */
    String update(T_Categorie tCategorie);

    /**
     * 通过主键删除数据
     *
     * @param categorieId 主键
     * @return 是否成功
     */
    String deleteById(Long categorieId);

}