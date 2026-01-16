package com.example.crosseller.repo;

import com.example.crosseller.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserrRepo extends JpaRepository<User,Long> {
}
