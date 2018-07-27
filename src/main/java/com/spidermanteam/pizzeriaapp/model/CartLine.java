package com.spidermanteam.pizzeriaapp.model;

import javax.persistence.*;

@Entity
@Table(name="cart_lines")
public class CartLine {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(
            name="id")
    private Product product;

    @Column(name="quantity")
    private int quantity;

    @Column(name="subSum")
    private Double subSum;

    public CartLine(Product product, int quantity, Double subSum) {
        this.product = product;
        this.quantity = quantity;
        this.subSum = subSum;
    }

    public CartLine() {

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

    public Double getSubSum() {
        return subSum;
    }

    public void setSubSum(Double subSum) {
        this.subSum = subSum;
    }
}
