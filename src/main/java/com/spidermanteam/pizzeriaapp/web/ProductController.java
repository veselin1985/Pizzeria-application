package com.spidermanteam.pizzeriaapp.web;

import com.spidermanteam.pizzeriaapp.model.Product;
import com.spidermanteam.pizzeriaapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    Product getById(@PathVariable("id") String id) {
        return productService.findById(Integer.parseInt(id));

    }

    @GetMapping
    List<Product> listAll() {
        return productService.listAll();
    }


}
