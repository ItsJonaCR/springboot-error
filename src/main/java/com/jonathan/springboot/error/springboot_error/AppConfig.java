package com.jonathan.springboot.error.springboot_error;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.jonathan.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    List<User> users() {
        return Arrays.asList(new User(1L, "Jonathan", "Vasquez"),
                new User(2L, "Juan", "Rodriguez"),
                new User(3L, "Ale", "Gonzales"),
                new User(4L, "Maria", "Castillo"),
                new User(5L, "Robert", "Esquivel"));
    }
}
