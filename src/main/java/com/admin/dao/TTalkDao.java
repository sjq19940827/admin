package com.admin.dao;

import com.admin.pojo.TTalk;
import java.util.List;

/**
 * (TTalk)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-22 11:30:38
 */
public interface TTalkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param talkId 主键
     * @return 实例对象
     */
    TTalk queryById(Integer talkId);

    /**
     * 用户ID查回复
     * @param userId
     * @return
     */
    TTalk queryByuserid(Integer userId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TTalk> queryAll();

    /**
     * 新增数据
     *
     * @param tTalk 实例对象
     * @return 影响行数
     */
    int insert(TTalk tTalk);

    /**
     * 修改数据
     *
     * @param tTalk 实例对象
     * @return 影响行数
     */
    int update(TTalk tTalk);

    /**
     * 通过主键删除数据
     *
     * @param talkId 主键
     * @return 影响行数
     */
    int deleteById(Integer talkId);

}