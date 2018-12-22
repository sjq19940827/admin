package com.admin.pojo;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 订单表(TOrder)实体类
 *
 * @author makejava
 * @since 2018-12-19 14:54:07
 */
public class TOrder implements Serializable {
    private static final long serialVersionUID = -89408410138254878L;
    //订单id(主键)
    private Integer order_Id;
    //订单编号
    private String order_Number;
    //配送方式(1.为电子票,2.快递票)
    private Integer order_Mode;
    //票数
    private Integer order_Num;
    //票价(演出门票单价)
    private Double order_Price;
    //运费
    private Double transport;
    //优惠价格(使用优惠券优惠了多少钱)
    private Double discount;
    //交易状态,0:交易关闭,1:待支付,2:待出票,3:待收货,4:已完成,5:已取消,6：已退款
    private Integer status;
    //用户id(外键)
    private Integer user_Id;
    //演出id(外键)
    private Integer show_Id;
    //收货地址id(外键)
    private Integer address_Id;
    //创建时间
    private Timestamp createdate;
    //发货时间
    private Timestamp deliverydate;
    //收货地址
    private String address;

    public static long getSerialVersionUID() {
        return TOrder.serialVersionUID;
    }

    public Integer getOrder_Id() {
        return this.order_Id;
    }

    public void setOrder_Id(final Integer order_Id) {
        this.order_Id = order_Id;
    }

    public String getOrder_Number() {
        return this.order_Number;
    }

    public void setOrder_Number(final String order_Number) {
        this.order_Number = order_Number;
    }

    public Integer getOrder_Mode() {
        return this.order_Mode;
    }

    public void setOrder_Mode(final Integer order_Mode) {
        this.order_Mode = order_Mode;
    }

    public Integer getOrder_Num() {
        return this.order_Num;
    }

    public void setOrder_Num(final Integer order_Num) {
        this.order_Num = order_Num;
    }

    public Double getOrder_Price() {
        return this.order_Price;
    }

    public void setOrder_Price(final Double order_Price) {
        this.order_Price = order_Price;
    }

    public Double getTransport() {
        return this.transport;
    }

    public void setTransport(final Double transport) {
        this.transport = transport;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(final Double discount) {
        this.discount = discount;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public Integer getUser_Id() {
        return this.user_Id;
    }

    public void setUser_Id(final Integer user_Id) {
        this.user_Id = user_Id;
    }

    public Integer getShow_Id() {
        return this.show_Id;
    }

    public void setShow_Id(final Integer show_Id) {
        this.show_Id = show_Id;
    }

    public Integer getAddress_Id() {
        return this.address_Id;
    }

    public void setAddress_Id(final Integer address_Id) {
        this.address_Id = address_Id;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(final Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getDeliverydate() {
        return this.deliverydate;
    }

    public void setDeliverydate(final Timestamp deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}