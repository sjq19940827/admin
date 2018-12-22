package com.admin.service;

import com.admin.pojo.TFind;
import java.util.List;

/**
 * (TFind)表服务接口
 *
 * @author makejava
 * @since 2018-12-21 20:25:46
 */
public interface TFindService {

    /**
     * 通过ID查询单条数据
     *
     * @param findId 主键
     * @return 实例对象
     */
    TFind queryById(Integer findId);

    /**
     *
     * @param userid
     * @return
     */
    TFind queryByUserId(Integer userid);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TFind> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    TFind insert(TFind tFind);

    /**
     * 修改数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    TFind update(TFind tFind);

    /**
     * 通过主键删除数据
     *
     * @param findId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer findId);

}