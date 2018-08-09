package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.data.base.OrderRepository;
import com.spidermanteam.pizzeriaapp.model.Order;
import com.spidermanteam.pizzeriaapp.service.base.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    @Override
    public List<Order> listAllOrders() {
        return orderRepository.listAllOrders();
    }

    @Override
    public Order findById(int id) {
        return orderRepository.findById(id);
    }
}
