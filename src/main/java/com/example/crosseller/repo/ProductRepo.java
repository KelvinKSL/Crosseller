package com.example.crosseller.repo;

import com.example.crosseller.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findBySellerId(Long sellerId);

    List<Product> findByNameContainingIgnoreCase(String name);
}
