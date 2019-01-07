package com.admin.service.impl;

import com.admin.dao.TOrderDao;
import com.admin.pojo.TOrder;
import com.admin.service.TOrderService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单表(TOrder)表服务实现类
 *
 * @author makejava
 * @since 2018-12-20 11:53:14
 */
@Service("tOrderService")
public class TOrderServiceImpl implements TOrderService {
    @Resource
    private TOrderDao tOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TOrder queryById(Integer orderId) {
        return this.tOrderDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<TOrder> queryAllByLimit(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        List<TOrder> all = tOrderDao.queryAll();
        return all;
    }

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder insert(TOrder tOrder) {
        this.tOrderDao.insert(tOrder);
        return tOrder;
    }

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public String update(TOrder tOrder) {
        final int update = this.tOrderDao.update(tOrder);
        if (update >0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer orderId) {
        int i = this.tOrderDao.deleteById(orderId);
        if (i>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}