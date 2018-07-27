package com.spidermanteam.pizzeriaapp.data;

import com.spidermanteam.pizzeriaapp.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> listAll();
    Product findById(int id);
}
