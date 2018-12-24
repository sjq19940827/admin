package com.admin.dao;

import com.admin.pojo.TFind;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TFind)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-21 20:25:46
 */
public interface TFindDao {

    /**
     * 通过ID查询单条数据
     *
     * @param findId 主键
     * @return 实例对象
     */
    TFind queryById(Integer findId);

    TFind queryByUserId(Integer userId);
    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TFind> queryAll();

    /**
     * 新增数据
     *
     * @param tFind 实例对象
     * @return 影响行数
     */
    int insert(TFind tFind);

    /**
     * 修改数据
     *
     * @param tFind 实例对象
     * @return 影响行数
     */
    int update(TFind tFind);

    /**
     * 通过主键删除数据
     *
     * @param findId 主键
     * @return 影响行数
     */
    int deleteById(Integer findId);

}