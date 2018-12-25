package com.admin.service.impl;

import com.admin.pojo.TTalk;
import com.admin.dao.TTalkDao;
import com.admin.service.TTalkService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TTalk)表服务实现类
 *
 * @author makejava
 * @since 2018-12-22 11:30:38
 */
@Service("tTalkService")
public class TTalkServiceImpl implements TTalkService {
    @Resource
    private TTalkDao tTalkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param talkId 主键
     * @return 实例对象
     */
    @Override
    public TTalk queryById(Integer talkId) {
        return this.tTalkDao.queryById(talkId);
    }

    /**
     * @param UserId
     * @return
     */
    @Override
    public TTalk queryByUserId(Integer UserId) {
        return tTalkDao.queryByuserid(UserId);
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
        List<TTalk> tTalks = tTalkDao.queryAll();
        return JSON.toJSONString(tTalks);
    }

    /**
     * 新增数据
     *
     * @param tTalk 实例对象
     * @return 实例对象
     */
    @Override
    public TTalk insert(TTalk tTalk) {
        this.tTalkDao.insert(tTalk);
        return tTalk;
    }

    /**
     * 修改数据
     *
     * @param tTalk 实例对象
     * @return 实例对象
     */
    @Override
    public TTalk update(TTalk tTalk) {
        this.tTalkDao.update(tTalk);
        return this.queryById(tTalk.getTalkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param talkId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer talkId) {
        int i = this.tTalkDao.deleteById(talkId);
        if (i > 0) {
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
}