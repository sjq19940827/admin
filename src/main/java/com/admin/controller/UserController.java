package com.admin.controller;

import com.admin.pojo.T_User;
import com.admin.service.Userservice;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   Administrator
 * Date:     2018/12/19 14:32
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
 * package com.admin.controller;
 * <p>
 * /**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/19
 * @since 1.0.0
 */
@RequestMapping("user/")
@RestController
@Api(value = "user/",description = "用户管理")
public class UserController {
    @Autowired
    @Qualifier("usi")
    private Userservice userservice;
    public Userservice getUserservice() {
        return this.userservice;
    }
    public void setUserservice(final Userservice userservice) {
        this.userservice = userservice;
    }
    @ResponseBody
    @RequestMapping("getuser")
    @ApiOperation(value = "分页查询所有用户信息" , httpMethod = "POST", notes = "返回所有用户信息数组")
    public String getuser(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<T_User> getuser = userservice.getuser(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",20);
        obj.put("data",getuser);
        return obj.toJSONString();
    }

    @ResponseBody
    @RequestMapping("getadd")
    @ApiOperation(value = "根据ID查询用户地址信息" , httpMethod = "POST", notes = "返回地址信息")
    public String getadd(@RequestParam("uid") Integer uid){
        String getadd = userservice.getadd(uid);
        return getadd;
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "动态修改个人信息" , notes = "相应修改返回值")
    public String update(T_User t_user){
        String updateuser = userservice.updateuser(t_user);
        return updateuser;
    }
}