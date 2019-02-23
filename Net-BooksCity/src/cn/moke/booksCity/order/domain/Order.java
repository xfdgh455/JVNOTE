package cn.moke.booksCity.order.domain;

import cn.moke.booksCity.user.domain.User;

import java.util.Date;
import java.util.List;

/**
 * Created by MOKE on 2019/2/3.
 */
public class Order {
    private String oid;
    private Date ordertime;
    private double total;
    private int state;//四种订单状态：1未付2已付款未发货，3已发货未确认收货，4已确认收获
    private User owner;
    private String address;
    private List<OrderItem> orderItemList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
