package com.spidermanteam.pizzeriaapp.web;

import com.spidermanteam.pizzeriaapp.model.Order;
import com.spidermanteam.pizzeriaapp.service.base.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders/listAll")
    List<Order> listAllOrders(){
        return orderService.listAllOrders();
    }
    @GetMapping("/api/orders/{id}")
    Order findById(@RequestParam("id") String id){
        int idNum = Integer.parseInt(id);
        return orderService.findById(idNum);
    }
}
