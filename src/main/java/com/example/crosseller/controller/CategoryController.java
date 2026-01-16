package com.example.crosseller.controller;

import com.example.crosseller.entity.Category;
import com.example.crosseller.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Category create(@RequestBody Category category) {
        return service.save(category);
    }
}
