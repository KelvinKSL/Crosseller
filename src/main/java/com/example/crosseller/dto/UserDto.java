package com.example.crosseller.dto;

import com.example.crosseller.entity.Role;

public record UserDto(

        Long id,
        String email,
        String fullName,
        Role role

) {

}
