package com.admin.service.impl;

import com.admin.pojo.TAdmin;
import com.admin.dao.TAdminDao;
import com.admin.service.TAdminService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TAdmin)表服务实现类
 *
 * @author makejava
 * @since 2018-12-24 14:51:35
 */
@Service("tAdminService")
public class TAdminServiceImpl implements TAdminService {
    @Resource
    private TAdminDao tAdminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param adminId 主键
     * @return 实例对象
     */
    @Override
    public TAdmin queryById(Integer adminId) {
        return this.tAdminDao.queryById(adminId);
    }

    @Override
    public String login(String addountnumber, String password) {
        Map<String,Object> map = new HashMap<String, Object>();
        TAdmin tAdmin1 = tAdminDao.queryByname(addountnumber);
        TAdmin tAdmin2 = tAdminDao.queryByphone(addountnumber);
        TAdmin tAdmin=new TAdmin();
        if (tAdmin1 != null) {
            tAdmin = tAdminDao.loginByname(addountnumber, password);
            if(tAdmin != null){
                map.put("admin",tAdmin);
                switch (tAdmin.getAdminMark()){
                    case 1:
                        map.put("code",1);
                        map.put("message","超级管理员");
                        break;
                    case 2:
                        map.put("code",2);
                        map.put("message","商品管理员");
                        break;
                    case 3:
                        map.put("code",3);
                        map.put("message","客服管理员");
                        break;
                    case 4:
                        map.put("code",4);
                        map.put("message","信息管理员");
                        break;
                    default:
                        map.put("code","0");
                        map.put("message","没有权限");
                        break;
                }
            }else {
                return "密码输入错误，请重新输入";
            }
        } else if (tAdmin2 != null) {
            tAdmin = tAdminDao.loginByphone(addountnumber, password);
            if(tAdmin != null){
                map.put("admin",tAdmin);
                switch (tAdmin.getAdminMark()){
                    case 1:
                        map.put("code",1);
                        map.put("message","超级管理员");
                        break;
                    case 2:
                        map.put("code",2);
                        map.put("message","商品管理员");
                        break;
                    case 3:
                        map.put("code",3);
                        map.put("message","客服管理员");
                        break;
                    case 4:
                        map.put("code",4);
                        map.put("message","信息管理员");
                        break;
                    default:
                        map.put("code","0");
                        map.put("message","没有权限");
                        break;
                }
            }else {
                return "密码输入错误，请重新输入";
            }
        }else {
            return "用户名输入错误，请重新输入";
        }
        return JSON.toJSONString(map);
    }

    @Override
    public List<TAdmin> queryAllByLimit(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum, pagesize);
        List<TAdmin> tAdmins = tAdminDao.queryAll();
        return tAdmins;
    }

    /**
     * 修改数据
     *
     * @param tAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public String update(TAdmin tAdmin) {
        int update = tAdminDao.update(tAdmin);
        if (update>0){
            return JSON.toJSONString(queryById(tAdmin.getAdminId()));
        }else {
            return "修改失败";
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer aid) {
        int i = tAdminDao.deleteById(aid);
        if (i > 0) {
            return "删除成功";
        }else {
            return "删除失败";
        }

    }

    /**
     * 修改管理员权限
     *
     * @param adminid
     * @param markid
     * @return
     */
    @Override
    public String updatemark(Integer adminid, Integer markid) {
        int updatemark = tAdminDao.updatemark(adminid, markid);
        if(updatemark>0){
            return JSON.toJSONString(tAdminDao.queryById(adminid));
        }else {
            return "修改权限失败";
        }
    }

    /**
     * 新增数据
     *
     * @param tAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(TAdmin tAdmin) {

        int insert = tAdminDao.insert(tAdmin);
        if (insert > 0) {
            return JSON.toJSONString(tAdmin);
        }else {
            return "新增失败";
        }
    }


}