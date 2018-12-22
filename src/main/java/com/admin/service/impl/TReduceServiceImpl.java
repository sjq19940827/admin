package com.admin.service.impl;

import com.admin.pojo.TReduce;
import com.admin.dao.TReduceDao;
import com.admin.service.TReduceService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (TReduce)表服务实现类
 *
 * @author makejava
 * @since 2018-12-21 15:29:37
 */
@Service("tReduceService")
public class TReduceServiceImpl implements TReduceService {
    @Resource
    private TReduceDao tReduceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param reduceId 主键
     * @return 实例对象
     */
    @Override
    public TReduce queryById(Integer reduceId) {
        return this.tReduceDao.queryById(reduceId);
    }


    @Override
    public TReduce queryByName(String cityName) {
        return tReduceDao.queryByName(cityName);
    }
    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    @Override
    public String queryAllByLimit(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum, pagesize);
        List<TReduce> tReduces = this.tReduceDao.queryAll();
        return JSON.toJSONString(tReduces);
    }

    /**
     * 新增数据
     *
     * @param tReduce 实例对象
     * @return 实例对象
     */
    @Override
    public TReduce insert(TReduce tReduce) {
        this.tReduceDao.insert(tReduce);
        return tReduce;
    }

    /**
     * 修改数据
     *
     * @param tReduce 实例对象
     * @return 实例对象
     */
    @Override
    public String update(TReduce tReduce) {
        int update = this.tReduceDao.update(tReduce);
        if(update>0){
            if (tReduce.getReduceId()==null){
                return JSON.toJSONString(queryByName(tReduce.getReduceTot()));
            }else {
                return JSON.toJSONString(this.queryById(tReduce.getReduceId()));
            }
        }else {
            return "修改失败";
        }

    }

    /**
     * 通过主键删除数据
     *
     * @param reduceId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer reduceId) {
        int i = this.tReduceDao.deleteById(reduceId);
        if (i>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}