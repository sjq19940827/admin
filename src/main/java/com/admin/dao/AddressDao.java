/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AddressDao
 * Author:   Administrator
 * Date:     2018/12/19 12:21
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

import com.admin.pojo.T_Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/19
 * @since 1.0.0
 */
@Repository("ad")
public interface AddressDao {
    /**
     * 根据用户ID查询用户地址信息
     * @param uid
     * @return
     */
    T_Address getadd(@Param("uid") int uid);

    /**
     * 动态修改个人信息
     * @param t_address
     * @return
     */
    int updateadd(T_Address t_address);
}
