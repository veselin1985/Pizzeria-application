package com.spidermanteam.pizzeriaapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "OrderProduct")
    private List<OrderProduct> orderProductList;

    private int status;

    @Column(name = "total_sum")
    private double totalSum;

    public Order(List<OrderProduct> productList, int status, double totalSum) {
        this.orderProductList = productList;
        this.totalSum = totalSum;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProduct> productList) {
        this.orderProductList = productList;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
