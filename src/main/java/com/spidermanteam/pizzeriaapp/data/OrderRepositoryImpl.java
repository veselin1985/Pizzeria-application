package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.data.base.OrderRepository;
import com.spidermanteam.pizzeriaapp.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepositoryImpl  implements OrderRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public OrderRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addOrder(Order order) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Order> listAllOrders() {
        List<Order> orders = new ArrayList<>();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            orders = session.createQuery("from Order").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return orders;
    }

    @Override
    public Order findById(int id) {
        return null;
    }
}
