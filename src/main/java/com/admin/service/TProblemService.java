package com.admin.service;

import com.admin.pojo.City;
import com.admin.pojo.TProblem;
import java.util.List;

/**
 * (TProblem)表服务接口
 *
 * @author makejava
 * @since 2018-12-24 11:19:36
 */
public interface TProblemService {

    /**
     * 通过ID查询单条数据
     *
     * @param questionId 主键
     * @return 实例对象
     */
    TProblem queryById(Integer questionId);

    /**
     * 通过
     * @param title
     * @return
     */
    TProblem queryByTitle(String title);
    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    List<TProblem> queryAllByLimit(int pagenum, int pagesize);

    /**
     * 新增数据
     *
     * @param tProblem 实例对象
     * @return 实例对象
     */
    String insert(TProblem tProblem);

    /**
     * 修改数据
     *
     * @param tProblem 实例对象
     * @return 实例对象
     */
    String update(TProblem tProblem);

    /**
     * 通过主键删除数据
     *
     * @param questionId 主键
     * @return 是否成功
     */
    String deleteById(Integer questionId);

}