package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.data.base.OrderProductRepository;
import com.spidermanteam.pizzeriaapp.model.OrderProduct;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderProductRepositoryImpl implements OrderProductRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public OrderProductRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addOrderProduct(OrderProduct orderProduct) {

    }

    @Override
    public List<OrderProduct> listAllOrderProducts() {
        return null;
    }
}
