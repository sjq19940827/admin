package com.admin.dao;

import com.admin.pojo.T_Show;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (T_Show)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-19 19:27:28
 */
public interface TShowDao {

    /**
     * 通过ID查询单条数据
     *
     * @param showId 主键
     * @return 实例对象
     */
    T_Show queryById(Long showId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<T_Show> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     *
     * @return 对象列表
     */
    List<T_Show> queryAll();

    /**
     * 新增数据
     *
     * @param tShow 实例对象
     * @return 影响行数
     */
    int insert(T_Show tShow);

    /**
     * 修改数据
     *
     * @param tShow 实例对象
     * @return 影响行数
     */
    int update(T_Show tShow);

    /**
     * 通过主键删除数据
     *
     * @param showId 主键
     * @return 影响行数
     */
    int deleteById(@Param("showId") Long showId);

}