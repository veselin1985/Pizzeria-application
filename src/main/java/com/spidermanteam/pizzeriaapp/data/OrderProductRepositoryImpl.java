package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.data.base.OrderProductRepository;
import com.spidermanteam.pizzeriaapp.model.OrderProduct;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(orderProduct);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<OrderProduct> listAllOrderProducts() {
        List<OrderProduct> orderProductList = new ArrayList<>();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            orderProductList = session.createQuery("from OrderProduct ").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return orderProductList;
    }
}

