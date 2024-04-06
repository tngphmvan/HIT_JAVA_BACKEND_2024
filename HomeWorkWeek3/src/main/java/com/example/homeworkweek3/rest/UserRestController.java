package com.example.homeworkweek3.rest;

import com.example.homeworkweek3.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private final List<User> users;

    public UserRestController(List<User> users) {
        this.users = users;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return users;
    }
}
