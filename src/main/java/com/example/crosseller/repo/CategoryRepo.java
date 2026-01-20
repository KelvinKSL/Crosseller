package com.example.crosseller.repo;

import com.example.crosseller.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    List<Category> findByNameLikeIgnoreCaseAndIsActiveTrue(String name);
}
