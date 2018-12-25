package com.admin.service;

import com.admin.pojo.City;
import com.admin.pojo.TAdmin;
import com.admin.pojo.TFind;

import java.util.List;

/**
 * (TAdmin)表服务接口
 *
 * @author makejava
 * @since 2018-12-24 14:51:35
 */
public interface TAdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param adminId 主键
     * @return 实例对象
     */
    TAdmin queryById(Integer adminId);

    /**
     * 登录
     * @param addountnumber
     * @param password
     * @return
     */
    String login(String addountnumber , String password);

    /**
     * 分页显示管理员信息
     * @param pagenum
     * @param pagesize
     * @return
     */
    String queryAllByLimit(int pagenum, int pagesize);

    /**
     * 修改数据
     *
     * @param tAdmin 实例对象
     * @return 实例对象
     */
    String update(TAdmin tAdmin);


    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    String deleteById(Integer aid);

    /**
     * 修改管理员权限
     * @param adminid
     * @param markid
     * @return
     */
    String updatemark(Integer adminid, Integer markid);


    /**
     * 新增数据
     *
     * @param tAdmin 实例对象
     * @return 实例对象
     */
    String insert(TAdmin tAdmin);

}