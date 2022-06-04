package com.alexeykuznetsov.petproject.service;

import com.alexeykuznetsov.petproject.entity.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    User getUserById(Long id);
    void deleteUser(Long id);
}
