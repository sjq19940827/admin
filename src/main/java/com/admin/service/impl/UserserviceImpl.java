package com.admin.service.impl;

import com.admin.dao.AddressDao;
import com.admin.dao.UserDao;
import com.admin.pojo.T_Address;
import com.admin.pojo.T_User;
import com.admin.service.Userservice;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserserviceImpl
 * Author:   Administrator
 * Date:     2018/12/19 13:57
 * Description:
 * History:
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * //                            _ooOoo_  
 * //                           o8888888o  
 * //                           88" . "88  
 * //                           (| -_- |)  
 * //                            O\ = /O  
 * //                        ____/`---'\____  
 * //                      .   ' \\| |// `.  
 * //                       / \\||| : |||// \  
 * //                     / _||||| -:- |||||- \  
 * //                       | | \\\ - /// | |  
 * //                     | \_| ''\---/'' | |  
 * //                      \ .-\__ `-` ___/-. /  
 * //                   ___`. .' /--.--\ `. . __  
 * //                ."" '< `.___\_<|>_/___.' >'"".  
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /  
 * //         ======`-.____`-.___\_____/___.-`____.-'======  
 * //                            `=---='  
 * //  
 * //         .............................................  
 * //                  佛祖镇楼                 BUG辟易  
 * //          佛曰:  
 * //                  写字楼里写字间，写字间里程序员；  
 * //                  程序人员写程序，又拿程序换酒钱。  
 * //                  酒醒只在网上坐，酒醉还来网下眠；  
 * //                  酒醉酒醒日复日，网上网下年复年。  
 * //                  但愿老死电脑间，不愿鞠躬老板前；  
 * //                  奔驰宝马贵者趣，公交自行程序员。  
 * //                  别人笑我忒疯癫，我笑自己命太贱；  
 * //                  不见满街漂亮妹，哪个归得程序员？ 
 * <p>
 * package com.admin.service.impl;
 * <p>
 * /**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/19
 * @since 1.0.0
 */
@Service("usi")
public class UserserviceImpl implements Userservice {
    @Autowired
    @Qualifier("ud")
    private UserDao userDao;
    public UserDao getUserDao() {
        return this.userDao;
    }

    public void setUserDao(final UserDao userDao) {
        this.userDao = userDao;
    }

    @Qualifier("ad")
    @Autowired
    private AddressDao addressDao;
    /**
     * 显示所有用户信息
     *
     * @param pagenum
     * @param pagesize
     * @return
     */
    @Override
    public String getuser(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        List<T_User> getall = userDao.getall();
        String s = JSON.toJSONString(getall);
        return s;
    }

    /**
     * 修改个人信息
     *
     * @param
     * @return
     */
    @Override
    public String updateuser(T_User t_user) {
        int updateuser = userDao.updateuser(t_user);
        if (updateuser!=0){
            return "成功";
        }else {
            return "失败";
        }
    }

    /**
     * 根据用户ID查询用户地址信息
     *
     * @param uid
     * @return
     */
    @Override
    public String getadd(int uid) {
        T_Address getadd = addressDao.getadd(uid);
        return JSON.toJSONString(getadd);
    }
}