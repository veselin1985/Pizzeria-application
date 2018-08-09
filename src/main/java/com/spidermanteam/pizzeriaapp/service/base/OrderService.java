package com.spidermanteam.pizzeriaapp.service.base;

import com.spidermanteam.pizzeriaapp.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> listAllOrders();
    Order findById(int id);
}
