package com.admin.service.impl;

import com.admin.pojo.T_Categorie;
import com.admin.dao.TCategorieDao;
import com.admin.service.TCategorieService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (T_Categorie)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 16:32:04
 */
@Service("tCategorieService")
public class TCategorieServiceImpl implements TCategorieService {
    @Resource
    private TCategorieDao tCategorieDao;

    /**
     * 通过ID查询单条数据
     *
     * @param categorieId 主键
     * @return 实例对象
     */
    @Override
    public T_Categorie queryById(Long categorieId) {
        return this.tCategorieDao.queryById(categorieId);
    }

    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    @Override
    public String queryAllByLimit(int pagenum,int pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        List<T_Categorie> getall = this.tCategorieDao.getall();
        return JSON.toJSONString(getall);
    }

    /**
     * 新增数据
     *
     * @param tCategorie 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(T_Categorie tCategorie) {
        Integer insert = tCategorieDao.insert(tCategorie);
        if (insert>0){
            return "新增成功";
        }else {
            return "新增失败";
        }

    }

    /**
     * 修改数据
     *
     * @param tCategorie 实例对象
     * @return 实例对象
     */
    @Override
    public String update(T_Categorie tCategorie) {
        this.tCategorieDao.update(tCategorie);
        T_Categorie tCategorie1 = this.queryById(tCategorie.getCategorie_Id());
        return JSON.toJSONString(tCategorie);
    }

    /**
     * 通过主键删除数据
     *
     * @param categorieId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Long categorieId) {
        int i = this.tCategorieDao.deleteById(categorieId);
        if (i>0){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
}