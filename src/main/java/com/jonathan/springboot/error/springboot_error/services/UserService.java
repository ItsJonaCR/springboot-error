package com.jonathan.springboot.error.springboot_error.services;

import java.util.List;

import com.jonathan.springboot.error.springboot_error.models.domain.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);

}
