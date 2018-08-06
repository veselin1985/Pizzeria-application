package com.spidermanteam.pizzeriaapp.model;

import javax.persistence.*;

@Entity
@Table(name="cart_lines")
public class CartLine {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(
            name="product")
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

    public Double getSubSum() {
        return subSum;
    }

    public void setSubSum(Double subSum) {
        this.subSum = subSum;
    }

    @Override
    public boolean equals(Object obj) {
        CartLine other = (CartLine) obj;
        if(obj == null){
            return false;
        }
        return this.product.hashCode() == (other.product.hashCode());
    }

    @Override
    public int hashCode() {
        return this.product.hashCode()*37;
    }
}
