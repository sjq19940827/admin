package com.admin.service;

import com.admin.pojo.TOrder;
import com.admin.pojo.T_Show;

import java.util.List;

/**
 * (T_Show)表服务接口
 *
 * @author makejava
 * @since 2018-12-19 19:27:28
 */
public interface TShowService {

    /**
     * 通过ID查询单条数据
     *
     * @param showId 主键
     * @return 实例对象
     */
    String queryById(Long showId);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    String queryAllByLimit(int pagenum,int pagesize);

    /**
     * 新增数据
     *
     * @param tShow 实例对象
     * @return 实例对象
     */
    String insert(T_Show tShow);

    /**
     * 修改数据
     *
     * @return 实例对象
     */
    String update(T_Show t_show);

    /**
     * 通过主键删除数据
     *
     * @param showId 主键
     * @return 是否成功
     */
    String deleteById(Long showId);

}