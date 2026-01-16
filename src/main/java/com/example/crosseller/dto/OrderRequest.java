package com.example.crosseller.dto;

import java.util.List;

public class OrderRequest{

    public record CreateOrderRequest(
            Long buyerId,
            List<OrderItemRequest> items
    ) {}

    public record OrderItemRequest(
            Long productId,
            Integer quantity
    ) {}
}
