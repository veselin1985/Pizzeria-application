package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Order;

import java.util.List;

public interface OrderRepository {

    List<Order> listAllOrders();
    Order findById(int id);
}
