package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.CartLine;
import com.spidermanteam.pizzeriaapp.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartLineRepositoryImpl implements CartLineRepository {

    private SessionFactory factory;

    @Autowired
    public CartLineRepositoryImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void add(CartLine cartLine) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(cartLine);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void delete(CartLine cartLine) {
        List<CartLine> cartLines = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            cartLines = session.createQuery("from CartLine").list();
            cartLines.remove(cartLine);
            session.save(cartLines);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteAll() {
        List<CartLine> cartLines = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            cartLines = session.createQuery("from CartLine").list();
            cartLines.clear();
            session.save(cartLines);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void update(CartLine cartLine) {


    }

    @Override
    public List<CartLine> listAll() {
        List<CartLine> cartLines = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            cartLines = session.createQuery("from CartLine").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cartLines;
    }
}
