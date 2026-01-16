package com.example.crosseller.service.Impl;

import com.example.crosseller.entity.Category;
import com.example.crosseller.repo.CategoryRepo;
import com.example.crosseller.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo repo;

    @Autowired
    public CategoryServiceImpl(CategoryRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Category> getAll() {
        return repo.findAll();
    }

    @Override
    public Category save(Category category) {
        return repo.save(category);
    }
}
