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
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    String queryAllByLimit(int pagenum, int pagesize);

    /**
     * 新增数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    String insert(TFind tFind);

    /**
     * 修改数据
     *
     * @param tFind 实例对象
     * @return 实例对象
     */
    String update(TFind tFind);

    /**
     * 通过主键删除数据
     *
     * @param findId 主键
     * @return 是否成功
     */
    String deleteById(Integer findId);

}