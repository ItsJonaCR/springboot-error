package com.jonathan.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jonathan.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList;

    public UserServiceImpl() {
        this.userList = new ArrayList<>();
        this.userList.add(new User(1L, "Jonathan", "Vasquez"));
        this.userList.add(new User(2L, "Juan", "Rodriguez"));
        this.userList.add(new User(3L, "Ale", "Gonzales"));
        this.userList.add(new User(4L, "Maria", "Castillo"));
        this.userList.add(new User(5L, "Robert", "Esquivel"));
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userList.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null));
    }

}
