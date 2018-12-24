package com.admin.service.impl;

import com.admin.pojo.T_Show;
import com.admin.dao.TShowDao;
import com.admin.service.TShowService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (T_Show)表服务实现类
 *
 * @author makejava
 * @since 2018-12-19 19:27:28
 */
@Service("tShowService")
public class TShowServiceImpl implements TShowService {
    @Resource
    private TShowDao tShowDao;

    /**
     * 通过ID查询单条数据
     *
     * @param showId 主键
     * @return 实例对象
     */
    @Override
    public String queryById(Long showId) {
        T_Show t_show = tShowDao.queryById(showId);
        return JSON.toJSONString(t_show);
    }

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    @Override
    public String queryAllByLimit(int pagenum,int pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        List<T_Show> t_shows = tShowDao.queryAll();
        return JSON.toJSONString(t_shows);
    }

    /**
     * 新增数据
     *
     * @param tShow 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(T_Show tShow) {
        int insert = this.tShowDao.insert(tShow);
        if (insert!=0){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }

    /**
     * 修改数据
     *
     * @return 实例对象
     */
    @Override
    public String update(T_Show t_show) {
        int s = tShowDao.update(t_show);
        if (s>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param showId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Long showId) {
        if (tShowDao.deleteById(showId) > 0){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
}