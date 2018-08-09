package com.spidermanteam.pizzeriaapp.data.base;

import com.spidermanteam.pizzeriaapp.model.OrderProduct;

import java.util.List;

public interface OrderProductRepository {

    void addOrderProduct(OrderProduct orderProduct);
    List<OrderProduct> listAllOrderProducts();

}
