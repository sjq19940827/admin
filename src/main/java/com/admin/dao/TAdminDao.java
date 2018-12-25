package com.admin.dao;

import com.admin.pojo.TAdmin;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TAdmin)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-24 14:51:35
 */
public interface TAdminDao {

    /**
     * 通过ID查询单条数据
     *
     * @param adminId 主键
     * @return 实例对象
     */
    TAdmin queryById(@Param("adminId") Integer adminId);

    /**
     * 根据用户名查询
     * @param adminName
     * @return
     */
    TAdmin queryByname(@Param("adminName") String adminName);

    /**
     * 根据电话号查询
     * @param adminPhone
     * @return
     */
    TAdmin queryByphone(@Param("adminPhone") String adminPhone);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<TAdmin> queryAll();

    /**
     * 新增数据
     *
     * @param tAdmin 实例对象
     * @return 影响行数
     */
    int insert(TAdmin tAdmin);

    /**
     * 修改数据
     *
     * @param tAdmin 实例对象
     * @return 影响行数
     */
    int update(TAdmin tAdmin);

    /**
     * 通过主键删除数据
     *
     * @param adminId 主键
     * @return 影响行数
     */
    int deleteById(Integer adminId);

    /**
     * 用户名登录
     * @param adminName
     * @param adminPwd
     * @return
     */
    TAdmin loginByname(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);

    /**
     * 手机号登录
     * @param adminPhone
     * @param adminPwd
     * @return
     */
    TAdmin loginByphone(String adminPhone, String adminPwd);

    int updatemark(@Param("adminId") int adminId, @Param("adminMark") int adminMark);
}