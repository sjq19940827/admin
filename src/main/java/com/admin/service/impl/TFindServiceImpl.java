package com.admin.service.impl;

import com.admin.pojo.TFind;
import com.admin.dao.TFindDao;
import com.admin.pojo.TReduce;
import com.admin.service.TFindService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TFind)表服务实现类
 *
 * @author makejava
 * @since 2018-12-21 20:25:46
 */
@Service("tFindService")
public class TFindServiceImpl implements TFindService {
    @Resource
    private TFindDao tFindDao;

    /**
     * 通过ID查询单条数据
     *
     * @param findId 主键
     * @return 实例对象
     */
    @Override
    public TFind queryById(Integer findId) {
        return this.tFindDao.queryById(findId);
    }

    @Override
    public TFind queryByUserId(Integer userid) {
        return tFindDao.queryByUserId(userid);
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
        List<TFind> tFinds = tFindDao.queryAll();
        return JSON.toJSONString(tFinds);
    }

    /**
     * 新增数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(TFind tFind) {
        int insert = this.tFindDao.insert(tFind);
        if (insert>0) {
            return JSON.toJSONString(tFind);
        }else {
            return "新增失败";
        }
    }

    /**
     * 修改数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    @Override
    public String update(TFind tFind) {
        if (tFind.getFindId()==null){
            tFind=tFindDao.queryByUserId(tFind.getUserId());
        }
        int update = this.tFindDao.update(tFind);
        if (update > 0) {
            return JSON.toJSONString(this.queryById(tFind.getFindId()));
        }else {
            return "修改失败";
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param findId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer findId) {
        int i = this.tFindDao.deleteById(findId);
        if (i>0){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
}