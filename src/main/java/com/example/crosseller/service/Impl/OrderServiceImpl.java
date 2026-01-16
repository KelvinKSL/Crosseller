package com.example.crosseller.service.Impl;

import com.example.crosseller.entity.Order;
import com.example.crosseller.entity.OrderStatus;
import com.example.crosseller.repo.OrderRepo;
import com.example.crosseller.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepo repo;

    @Autowired
    public OrderServiceImpl(OrderRepo repo) {
        this.repo = repo;
    }

    public Order create(Order order) {
        return repo.save(order);
    }

    @Override
    public List<Order> findAll() {
        return repo.findAll();
    }
}
