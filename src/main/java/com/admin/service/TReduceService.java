package com.admin.service;

import com.admin.pojo.TReduce;

import java.util.List;

/**
 * (TReduce)表服务接口
 *
 * @author makejava
 * @since 2018-12-21 15:29:37
 */
public interface TReduceService {

    /**
     * 通过ID查询单条数据
     *
     * @param reduceId 主键
     * @return 实例对象
     */
    TReduce queryById(Integer reduceId);


    TReduce queryByName(String reducetot);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    String queryAllByLimit(int pagenum, int pagesize);

    /**
     * 新增数据
     *
     * @param tReduce 实例对象
     * @return 实例对象
     */
    TReduce insert(TReduce tReduce);

    /**
     * 修改数据
     *
     * @param tReduce 实例对象
     * @return 实例对象
     */
    String update(TReduce tReduce);

    /**
     * 通过主键删除数据
     *
     * @param reduceId 主键
     * @return 是否成功
     */
    String deleteById(Integer reduceId);

}