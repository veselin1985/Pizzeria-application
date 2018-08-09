package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.data.base.CartLineRepository;
import com.spidermanteam.pizzeriaapp.model.CartLine;
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
        List<CartLine> cartLines = new ArrayList<>();
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            cartLines = session.createQuery("from CartLine").list();
            if (cartLines.size() == 0) {
                double updateSubSum = cartLine.getQuantity()*cartLine.getProduct().getPrice();
                cartLine.setSubSum(updateSubSum);
                session.save(cartLine);
            } else {
                if (cartLines.contains(cartLine))
                    for (CartLine cart : cartLines) {
                        if (cart.getProduct().equals(cartLine.getProduct())) {
                            int updateQty = cart.getQuantity() + 1;
                            cart.setQuantity(updateQty);
                            double updateSubSum = cart.getQuantity()*cart.getProduct().getPrice();
                            cart.setSubSum(updateSubSum);
                            session.save(cart);
                            break;
                        }
                    }
                else {
                    double updateSubSum = cartLine.getQuantity()*cartLine.getProduct().getPrice();
                    cartLine.setSubSum(updateSubSum);
                    session.save(cartLine);
                }
            }

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
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from CartLine").executeUpdate();
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
