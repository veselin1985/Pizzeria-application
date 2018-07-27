package com.spidermanteam.pizzeriaapp.model;

import java.util.List;

public class Cart {

    private List<CartLine> cartLinesList;
    private double totalSum;

    public Cart(List<CartLine> cartLines, double totalSum) {
        this.cartLinesList = cartLines;
        this.totalSum = totalSum;
    }

    public Cart() {
    }

    public List<CartLine> getCartLinesList() {
        return cartLinesList;
    }

    public void setCartLinesList(List<CartLine> cartLinesList) {
        this.cartLinesList = cartLinesList;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public boolean isCartContainsProduct(Product product) {
        for (CartLine cartLine : this.getCartLinesList()) {

            if (cartLine.getProduct().equals(product)) {
                return true;
            }

        }
        return false;
    }

    public void increaseCartLineQty(Product product) {
        for (CartLine cartLine : this.getCartLinesList()) {
            if (cartLine.getProduct().equals(product)) {
                int qty = cartLine.getQuantity();
                qty++;
                cartLine.setQuantity(qty);

            }
        }
    }

    public Double calculateCartTotalSum(){
        double totalSum = 0.0;

        for (CartLine cartLine : this.getCartLinesList()){
            totalSum+=cartLine.getSubSum();
        }
        return totalSum;
    }

}
