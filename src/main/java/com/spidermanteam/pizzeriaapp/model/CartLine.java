package com.spidermanteam.pizzeriaapp.model;

public class CartLine {

    private int id;
    private Product product;
    private int quantity;
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
