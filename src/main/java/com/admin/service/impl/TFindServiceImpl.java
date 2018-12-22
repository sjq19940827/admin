package com.admin.service.impl;

import com.admin.pojo.TFind;
import com.admin.dao.TFindDao;
import com.admin.pojo.TReduce;
import com.admin.service.TFindService;
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
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TFind> queryAllByLimit(int offset, int limit) {
        return this.tFindDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    @Override
    public TFind insert(TFind tFind) {
        this.tFindDao.insert(tFind);
        return tFind;
    }

    /**
     * 修改数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    @Override
    public TFind update(TFind tFind) {
        this.tFindDao.update(tFind);
        return this.queryById(tFind.getFindId());
    }

    /**
     * 通过主键删除数据
     *
     * @param findId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer findId) {
        return this.tFindDao.deleteById(findId) > 0;
    }
}