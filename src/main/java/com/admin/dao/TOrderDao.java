package com.admin.dao;

import com.admin.pojo.TOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单表(TOrder)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-24 12:10:20
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
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TOrder> queryAll();

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
    int deleteById(Integer orderId);

}