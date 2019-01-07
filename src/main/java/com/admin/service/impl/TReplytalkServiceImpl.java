package com.admin.service.impl;

import com.admin.pojo.TReplytalk;
import com.admin.dao.TReplytalkDao;
import com.admin.service.TReplytalkService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TReplytalk)表服务实现类
 *
 * @author makejava
 * @since 2018-12-22 11:31:04
 */
@Service("tReplytalkService")
public class  TReplytalkServiceImpl implements TReplytalkService {
    @Resource
    private TReplytalkDao tReplytalkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param replyId 主键
     * @return 实例对象
     */
    @Override
    public TReplytalk queryById(Integer replyId) {
        return this.tReplytalkDao.queryById(replyId);
    }

    /**
     * @param UserId
     * @return
     */
    @Override
    public TReplytalk queryByUserId(Integer UserId) {
        return tReplytalkDao.queryByuserid(UserId);
    }

    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    @Override
    public List<TReplytalk> queryAllByLimit(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum, pagesize);
        List<TReplytalk> tReplytalks = tReplytalkDao.queryAll();
        return tReplytalks;
    }

    /**
     * 新增数据
     *
     * @param tReplytalk 实例对象
     * @return 实例对象
     */
    @Override
    public TReplytalk insert(TReplytalk tReplytalk) {
        this.tReplytalkDao.insert(tReplytalk);
        return tReplytalk;
    }

    /**
     * 修改数据
     *
     * @param tReplytalk 实例对象
     * @return 实例对象
     */
    @Override
    public TReplytalk update(TReplytalk tReplytalk) {
        this.tReplytalkDao.update(tReplytalk);
        return this.queryById(tReplytalk.getReplyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param replyId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer replyId) {
        int i = this.tReplytalkDao.deleteById(replyId);
        if (i>0) {
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
}