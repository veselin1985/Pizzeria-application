package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.data.base.OrderProductRepository;
import com.spidermanteam.pizzeriaapp.model.OrderProduct;
import com.spidermanteam.pizzeriaapp.service.base.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductServiceImpl implements OrderProductService {

    OrderProductRepository orderProductRepository;

    @Autowired
    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }


    @Override
    public void addOrderProduct(OrderProduct orderProduct) {
        orderProductRepository.addOrderProduct(orderProduct);

    }

    @Override
    public List<OrderProduct> listAllOrderProducts() {
        return orderProductRepository.listAllOrderProducts();
    }
}
