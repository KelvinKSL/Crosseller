package com.example.crosseller.dto;

import com.example.crosseller.entity.OrderStatus;

import java.time.LocalDateTime;

public record OrderResponse(
        Long id,
        Double totalAmount,
        OrderStatus status,
        LocalDateTime createdAt
) {
}
