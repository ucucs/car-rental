package com.ucucs.rental.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CarOrder {
    private Integer orderId;

    private Integer userId;

    private Integer stockId;

    private BigDecimal rentPrice;

    private BigDecimal deposit;

    private BigDecimal totalPrice;

    private Date rentalFrom;

    private Date rentalTo;

    private Byte orderStatus;

    private Boolean payStatus;

    private Date createTime;

    private Date updateTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public BigDecimal getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(BigDecimal rentPrice) {
        this.rentPrice = rentPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getRentalFrom() {
        return rentalFrom;
    }

    public void setRentalFrom(Date rentalFrom) {
        this.rentalFrom = rentalFrom;
    }

    public Date getRentalTo() {
        return rentalTo;
    }

    public void setRentalTo(Date rentalTo) {
        this.rentalTo = rentalTo;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}