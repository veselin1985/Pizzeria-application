package com.spidermanteam.pizzeriaapp.service.base;

import com.spidermanteam.pizzeriaapp.model.OrderProduct;

import java.util.List;

public interface OrderProductService {

    void addOrderProduct(OrderProduct orderProduct);
    List<OrderProduct> listAllOrderProducts();
}
