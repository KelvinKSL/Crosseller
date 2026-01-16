package com.example.crosseller.service;

import com.example.crosseller.entity.Order;

import java.util.List;

public interface OrderService {
    Order create(Order order);

    List<Order> findAll();
}
