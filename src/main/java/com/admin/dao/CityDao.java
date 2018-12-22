package com.admin.dao;

import com.admin.pojo.City;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (City)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-21 10:24:56
 */
public interface CityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    City queryById(Integer cityId);

    /**
     *
     * @param cityName
     * @return
     */
    City queryByName(String cityName);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<City> queryAll();

    /**
     * 新增数据
     *
     * @param city 实例对象
     * @return 影响行数
     */
    int insert(City city);

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 影响行数
     */
    int update(City city);

    /**
     * 通过主键删除数据
     *
     * @param cityId 主键
     * @return 影响行数
     */
    int deleteById(Integer cityId);

}