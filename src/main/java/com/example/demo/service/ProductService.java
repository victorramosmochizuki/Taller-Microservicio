package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product create(Product product);

    Product update(Product product);

    void delete(String id);
}
