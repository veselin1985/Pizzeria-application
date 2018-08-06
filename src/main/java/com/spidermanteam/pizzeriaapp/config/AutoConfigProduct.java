package com.spidermanteam.pizzeriaapp.config;

import com.spidermanteam.pizzeriaapp.model.CartLine;
import com.spidermanteam.pizzeriaapp.model.Comment;
import com.spidermanteam.pizzeriaapp.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigProduct {

    @Bean
    public SessionFactory createSessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(CartLine.class)
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();
    }
}
