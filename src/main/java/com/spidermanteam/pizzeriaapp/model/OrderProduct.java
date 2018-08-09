package com.spidermanteam.pizzeriaapp.model;

import javax.persistence.*;

@Entity
@Table(name = "order_product")
public class OrderProduct {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "Product")
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total_sum")
    private double totalSum;

    public OrderProduct(Product product, int quantity, double totalSum) {
        this.product = product;
        this.quantity = quantity;
        this.totalSum = totalSum;
    }

    public OrderProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }
}
