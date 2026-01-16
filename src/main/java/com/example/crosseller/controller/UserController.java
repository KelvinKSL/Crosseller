package com.example.crosseller.controller;

import com.example.crosseller.entity.User;
import com.example.crosseller.repo.UserrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserrRepo repo;

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }
}
