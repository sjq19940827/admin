package com.admin.service.impl;

import com.admin.pojo.City;
import com.admin.dao.CityDao;
import com.admin.service.CityService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (City)表服务实现类
 *
 * @author makejava
 * @since 2018-12-21 10:24:56
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    @Override
    public City queryById(Integer cityId) {
        return this.cityDao.queryById(cityId);
    }

    @Override
    public City queryByName(String cityName) {
        return cityDao.queryByName(cityName);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<City> queryAllByLimit(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        List<City> cities = cityDao.queryAll();
        return cities;
    }
    /**
     * 新增数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(City city) {
        int insert = this.cityDao.insert(city);
        if (insert>0){
            return JSON.toJSONString(city);
        }else {
            return "新增失败";
        }

    }

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    @Override
    public String update(City city) {
        int update = this.cityDao.update(city);
        if (update>0){
            return JSON.toJSONString(this.queryById(city.getCityId()));
        }else {
            System.out.println(city.getCityId()+city.getCityName());
            return "修改失败";
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param cityId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer cityId) {
        int i = this.cityDao.deleteById(cityId);
        if (i>0){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
}