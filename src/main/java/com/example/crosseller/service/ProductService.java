package com.example.crosseller.service;

import com.example.crosseller.dto.CreateProductRequest;
import com.example.crosseller.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(CreateProductRequest product);
    List<Product> getAll();
    Product getById(Long id);

    List<Product> findByName(String name);
    Product update(Long id,Product p);
    void delete(Long id);
}
