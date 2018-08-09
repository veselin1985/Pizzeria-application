package com.spidermanteam.pizzeriaapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "Product")
    private List<Product> productList;

    private int status;

    @Column(name = "total_sum")
    private double totalSum;

    public Order(List<Product> productList, int status, double totalSum) {
        this.productList = productList;
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
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
