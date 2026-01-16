package com.example.crosseller.service.Impl;

import com.example.crosseller.dto.CreateProductRequest;
import com.example.crosseller.entity.Category;
import com.example.crosseller.entity.Product;
import com.example.crosseller.entity.User;
import com.example.crosseller.repo.CategoryRepo;
import com.example.crosseller.repo.ProductRepo;
import com.example.crosseller.repo.UserrRepo;
import com.example.crosseller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo repo;

    @Autowired
    private UserrRepo userRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo repo) {
        this.repo = repo;
    }

    public Product create(CreateProductRequest dto) {
        // Load seller
        User seller = userRepo.findById(dto.getSellerId())
                .orElseThrow(() -> new RuntimeException("Seller not found"));

        // Load category
        Category category = categoryRepo.findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        // Map DTO → entity
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setImage(dto.getImage());
        product.setSeller(seller);
        product.setCategory(category);

        return repo.save(product);
    }



    public List<Product> getAll() {
        List<Product> products = repo.findAll();
        return products.stream().map(product -> product).collect(Collectors.toList());
    }

    public Product getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<Product> findByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }



    @Override
    public Product update(Long id, Product p) {
        Product existing = repo.findById(id).orElseThrow();

        existing.setName(p.getName());
        existing.setDescription(p.getDescription());
        existing.setPrice(p.getPrice());
        existing.setStock(p.getStock());
        existing.setImage(p.getImage());
        existing.setCategory(p.getCategory());

        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }


}
