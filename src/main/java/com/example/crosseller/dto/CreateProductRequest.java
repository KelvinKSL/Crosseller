package com.example.crosseller.dto;

import com.example.crosseller.entity.Product;
import lombok.Data;

@Data
public class CreateProductRequest {
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String image;
    private Long categoryId;
    private Long sellerId;
}
