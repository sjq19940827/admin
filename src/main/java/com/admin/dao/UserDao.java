/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserDao
 * Author:   Administrator
 * Date:     2018/12/19 11:57
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

package com.admin.dao;

import com.admin.pojo.T_User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/19
 * @since 1.0.0
 */
@Repository("ud")
public interface UserDao {
    /**
     * 查看全部用户信息
     * @return
     */
    List<T_User> getall();

    /**
     * 动态修改用户信息
     * @param t_user
     * @return
     */
    int updateuser(T_User t_user);


}
