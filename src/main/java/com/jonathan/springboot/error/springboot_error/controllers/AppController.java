package com.jonathan.springboot.error.springboot_error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.springboot.error.springboot_error.exceptions.UserNotFoundException;
import com.jonathan.springboot.error.springboot_error.models.domain.User;
import com.jonathan.springboot.error.springboot_error.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String index() {
        // int value = 100 / 0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "Ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = service.findById(id);
        if(user == null) {
            throw new UserNotFoundException("The user does not exist."); // Custom exception
        }
        System.out.println(user.getName()); // NullPointerException if null
        return user;
    }

}
