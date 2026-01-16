package com.example.crosseller.controller;

import com.example.crosseller.dto.CreateProductRequest;
import com.example.crosseller.entity.Product;
import com.example.crosseller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;



//    @GetMapping("/getall")
//    public List<CreateProductRequest > getAll() {
//        return service.getAll()
//                .stream()
//                .map(a -> )
//                .toList();
//    }

    @GetMapping("/findbyid/{id}")
    public Product findById(@PathVariable Long id) {
        return service.getById(id);
    }
    @GetMapping("/search")
    public List<Product> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping
    public CreateProductRequest  create(@RequestBody CreateProductRequest request) {
        Product saved = service.create(request);

        CreateProductRequest  dto = new CreateProductRequest ();
       
        dto.setName(saved.getName());
        dto.setDescription(saved.getDescription());
        dto.setPrice(saved.getPrice());
        dto.setStock(saved.getStock());
        dto.setImage(saved.getImage());
        dto.setCategoryId(saved.getCategory() != null ? saved.getCategory().getId() : null);
        dto.setSellerId(saved.getSeller() != null ? saved.getSeller().getId() : null);

        return dto;
    }




}
