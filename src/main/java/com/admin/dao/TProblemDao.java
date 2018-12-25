package com.admin.dao;

import com.admin.pojo.TProblem;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TProblem)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-24 11:19:36
 */
public interface TProblemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param questionId 主键
     * @return 实例对象
     */
    TProblem queryById(Integer questionId);

    TProblem queryByTitle(String questionTitle);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TProblem> queryAll();

    /**
     * 新增数据
     *
     * @param tProblem 实例对象
     * @return 影响行数
     */
    int insert(TProblem tProblem);

    /**
     * 修改数据
     *
     * @param tProblem 实例对象
     * @return 影响行数
     */
    int update(TProblem tProblem);

    /**
     * 通过主键删除数据
     *
     * @param questionId 主键
     * @return 影响行数
     */
    int deleteById(Integer questionId);

}