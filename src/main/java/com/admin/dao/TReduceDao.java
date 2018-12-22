package com.admin.dao;

import com.admin.pojo.City;
import com.admin.pojo.TReduce;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TReduce)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-21 15:29:37
 */
public interface TReduceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param reduceId 主键
     * @return 实例对象
     */
    TReduce queryById(Integer reduceId);

    /**
     * 根据名称查数据
     * @param cityName
     * @return
     */
    TReduce queryByName(String cityName);
    /**
     * 查全部
     *
     * @return 对象列表
     */
    List<TReduce> queryAll();

    /**
     * 新增数据
     *
     * @param tReduce 实例对象
     * @return 影响行数
     */
    int insert(TReduce tReduce);

    /**
     * 修改数据
     *
     * @param tReduce 实例对象
     * @return 影响行数
     */
    int update(TReduce tReduce);

    /**
     * 通过主键删除数据
     *
     * @param reduceId 主键
     * @return 影响行数
     */
    int deleteById(Integer reduceId);

}