package com.admin.dao;

import com.admin.pojo.TFind;
import com.admin.pojo.TReplytalk;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TReplytalk)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-22 11:31:04
 */
public interface TReplytalkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param replyId 主键
     * @return 实例对象
     */
    TReplytalk queryById(Integer replyId);

    /**
     * 用户ID查回复
     * @param userId
     * @return
     */
    TReplytalk queryByuserid(Integer userId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TReplytalk> queryAll();

    /**
     * 新增数据
     *
     * @param tReplytalk 实例对象
     * @return 影响行数
     */
    int insert(TReplytalk tReplytalk);

    /**
     * 修改数据
     *
     * @param tReplytalk 实例对象
     * @return 影响行数
     */
    int update(TReplytalk tReplytalk);

    /**
     * 通过主键删除数据
     *
     * @param replyId 主键
     * @return 影响行数
     */
    int deleteById(Integer replyId);

}