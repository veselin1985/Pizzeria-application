package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();
    Product findById(int id);
}
