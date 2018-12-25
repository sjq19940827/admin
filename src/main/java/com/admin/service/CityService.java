package com.admin.service;

import com.admin.pojo.City;
/**
 * (City)表服务接口
 *
 * @author makejava
 * @since 2018-12-21 10:24:56
 */
public interface CityService {

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    City queryById(Integer cityId);

    City queryByName(String cityName);

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
     * @param city 实例对象
     * @return 实例对象
     */
    City insert(City city);

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    String update(City city);

    /**
     * 通过主键删除数据
     *
     * @param cityId 主键
     * @return 是否成功
     */
    String deleteById(Integer cityId);

}