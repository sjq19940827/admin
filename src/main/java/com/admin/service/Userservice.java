/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Userservice
 * Author:   Administrator
 * Date:     2018/12/19 13:47
 * Description:
 * History:
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * <p>
 * /**
 * _ooOoo_
 * o8888888o
 * 88" . "88
 * (| -_- |)
 * O\ = /O
 * ___/`---'\____
 * .   ' \\| |// `.
 * / \\||| : |||// \
 * / _||||| -:- |||||- \
 * | | \\\ - /// | |
 * | \_| ''\---/'' | |
 * \ .-\__ `-` ___/-. /
 * ___`. .' /--.--\ `. . __
 * ."" '< `.___\_<|>_/___.' >'"".
 * | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 * `=---='
 * .............................................
 * 佛曰：bug泛滥，我已瘫痪！
 */

package com.admin.service;

import com.admin.pojo.T_Address;
import com.admin.pojo.T_User;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/19
 * @since 1.0.0
 */
public interface Userservice {
    /**
     * 显示所有用户信息
     * @param pagenum
     * @param pagesize
     * @return
     */
    List<T_User> getuser(int pagenum, int pagesize);

    /**
     * 修改个人信息
     * @param
     * @return
     */
    String updateuser(T_User t_user);
    /**
     * 根据用户ID查询用户地址信息
     * @param uid
     * @return
     */
    String getadd(int uid);
}
