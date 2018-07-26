package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private SessionFactory factory;

    @Autowired
    public ProductRepositoryImpl (SessionFactory factory){
        this.factory = factory;
    }

    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            products = session.createQuery("from Product").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    @Override
    public Product findById(String id) {
        Product product = null;
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            product = session.get(Product.class, id);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return product;
    }
}
