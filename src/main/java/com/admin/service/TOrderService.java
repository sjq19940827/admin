package com.admin.service;

import com.admin.pojo.TOrder;


/**
 * 订单表(TOrder)表服务接口
 *
 * @author makejava
 * @since 2018-12-20 11:53:14
 */
public interface TOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TOrder queryById(Integer orderId);

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
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder insert(TOrder tOrder);

    /**
     * 修改数据
     * @return 实例对象
     */
    String update(TOrder tOrder);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    String deleteById(Integer orderId);

}