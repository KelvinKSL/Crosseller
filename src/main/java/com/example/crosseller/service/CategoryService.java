package com.example.crosseller.service;

import com.example.crosseller.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category save(Category category);
}
