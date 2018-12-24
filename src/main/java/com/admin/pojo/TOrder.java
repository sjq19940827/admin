package com.admin.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(TOrder)实体类
 *
 * @author makejava
 * @since 2018-12-24 12:10:19
 */
public class TOrder implements Serializable {
    private static final long serialVersionUID = 400828565970090097L;
    //订单id(主键)
    private Integer orderId;
    //订单编号
    private String orderNumber;
    //配送方式(1.为电子票,2.快递票)
    private Integer orderMode;
    //票数
    private Integer orderNum;
    //票价(演出门票单价)
    private Object orderPrice;
    //运费
    private Object transport;
    //优惠价格(使用优惠券优惠了多少钱)
    private Object discount;
    //交易状态,0:交易关闭,1:待支付,2:待出票,3:待收货,4:已完成,5:已取消,6：已退款
    private Integer status;
    //用户id(外键)
    private Integer userId;
    //演出id(外键)
    private Integer showId;
    //收货地址id(外键)
    private Integer addressId;
    //创建时间
    private Date createdate;
    //发货时间
    private Date deliverydate;
    //收货地址
    private String address;
    //商品名称
    private String shopName;
    //商品图片
    private String shopImg;
    //用户姓名
    private String username;
    //用户手机号
    private String userphone;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(Integer orderMode) {
        this.orderMode = orderMode;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Object getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Object orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Object getTransport() {
        return transport;
    }

    public void setTransport(Object transport) {
        this.transport = transport;
    }

    public Object getDiscount() {
        return discount;
    }

    public void setDiscount(Object discount) {
        this.discount = discount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

}