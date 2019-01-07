package com.admin.service;

import com.admin.pojo.TReplytalk;
import com.admin.pojo.TTalk;
import java.util.List;

/**
 * (TTalk)表服务接口
 *
 * @author makejava
 * @since 2018-12-22 11:30:38
 */
public interface TTalkService {

    /**
     * 通过ID查询单条数据
     *
     * @param talkId 主键
     * @return 实例对象
     */
    TTalk queryById(Integer talkId);


    /**
     *
     * @param UserId
     * @return
     */
    TTalk queryByUserId(Integer UserId);
    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    List<TTalk> queryAllByLimit(int pagenum, int pagesize);

    /**
     * 新增数据
     *
     * @param tTalk 实例对象
     * @return 实例对象
     */
    TTalk insert(TTalk tTalk);

    /**
     * 修改数据
     *
     * @param tTalk 实例对象
     * @return 实例对象
     */
    TTalk update(TTalk tTalk);

    /**
     * 通过主键删除数据
     *
     * @param talkId 主键
     * @return 是否成功
     */
    String deleteById(Integer talkId);

}