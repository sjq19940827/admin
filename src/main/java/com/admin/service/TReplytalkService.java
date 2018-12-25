package com.admin.service;

import com.admin.pojo.TReplytalk;
import java.util.List;

/**
 * (TReplytalk)表服务接口
 *
 * @author makejava
 * @since 2018-12-22 11:31:04
 */
public interface TReplytalkService {

    /**
     * 通过ID查询单条数据
     *
     * @param replyId 主键
     * @return 实例对象
     */
    TReplytalk queryById(Integer replyId);

    /**
     *
     * @param UserId
     * @return
     */
    TReplytalk queryByUserId(Integer UserId);

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
     * @param tReplytalk 实例对象
     * @return 实例对象
     */
    TReplytalk insert(TReplytalk tReplytalk);

    /**
     * 修改数据
     *
     * @param tReplytalk 实例对象
     * @return 实例对象
     */
    TReplytalk update(TReplytalk tReplytalk);

    /**
     * 通过主键删除数据
     *
     * @param replyId 主键
     * @return 是否成功
     */
    String deleteById(Integer replyId);

}