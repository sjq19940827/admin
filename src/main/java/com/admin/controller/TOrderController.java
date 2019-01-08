package com.admin.controller;

import com.admin.pojo.TOrder;
import com.admin.service.TOrderService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * 订单表(TOrder)表控制层
 *
 * @author makejava
 * @since 2018-12-20 11:53:14
 */
@RestController
@RequestMapping("tOrder/")
@Api(value = "tOrder/",description = "订单管理")
public class TOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TOrderService tOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation(value = "按ID查询订单信息",httpMethod = "GET",notes = "订单json")
    public TOrder selectOne(Integer id) {
        return this.tOrderService.queryById(id);
    }

    @GetMapping("getall")
    @ApiOperation(value = "分页查询全部订单",httpMethod = "GET",notes = "订单json数组")
    public String getall(@RequestParam("page")int page , @RequestParam("limit") int limit){
        List<TOrder> tOrders = tOrderService.queryAllByLimit(page, limit);
        JSONObject obj=new JSONObject();
        obj.put("code",0);
        obj.put("msg","");
        obj.put("count",100);
        obj.put("data",tOrders);
        return obj.toJSONString();
    }

    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value="修改订单信息",notes="返回相应结果")
    public String update(@ApiParam(required = true, name ="tOrder", value ="订单对象") TOrder tOrder){
        String update = tOrderService.update(tOrder);
        return update;
    }

    @RequestMapping(value = "del" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    @ApiOperation(value="删除订单信息",httpMethod="GET",notes="返回相应结果")
    public String del(@ApiParam(required = true, name ="orderid", value ="订单ID")@RequestParam("orderid") Integer orderid){
        String s = tOrderService.deleteById(orderid);
        return s;
    }
}