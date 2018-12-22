package com.admin.dao;

import com.admin.pojo.TOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单表(TOrder)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-20 11:53:14
 */
public interface TOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TOrder queryById(Integer orderId);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<TOrder> getAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tOrder 实例对象
     * @return 对象列表
     */
    List<TOrder> queryAll(TOrder tOrder);

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 影响行数
     */
    int insert(TOrder tOrder);

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 影响行数
     */
    int update(TOrder tOrder);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(@Param("orderId") Integer orderId);

}