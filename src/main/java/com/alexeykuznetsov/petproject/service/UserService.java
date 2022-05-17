package com.alexeykuznetsov.petproject.service;

import com.alexeykuznetsov.petproject.entity.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    User getUserById(int id);
    void createUser(User user);
    void deleteUser(int id);
}
