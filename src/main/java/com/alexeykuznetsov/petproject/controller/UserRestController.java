package com.alexeykuznetsov.petproject.controller;

import com.alexeykuznetsov.petproject.entity.User;
import com.alexeykuznetsov.petproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    @Autowired
    UserService userService;

    @GetMapping("/showUser/{id}")
    @PreAuthorize("hasRole('USER') || hasRole('ADMIN')")
    public User showTradePointById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return user;
    }

    @DeleteMapping("/deleteUser/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/showAllUsers")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> showAllUsers() {
        List<User> userList = userService.showAllUsers();
        return userList;
    }
}
