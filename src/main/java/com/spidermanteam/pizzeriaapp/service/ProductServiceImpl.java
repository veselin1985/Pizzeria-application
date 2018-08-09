package com.spidermanteam.pizzeriaapp.service;

import com.spidermanteam.pizzeriaapp.data.base.ProductRepository;
import com.spidermanteam.pizzeriaapp.model.Product;
import com.spidermanteam.pizzeriaapp.service.base.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAll() {
        return productRepository.listAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }
}
