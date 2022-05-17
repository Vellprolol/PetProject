package com.alexeykuznetsov.petproject.dao;

import com.alexeykuznetsov.petproject.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> showAllUsers();
    User getUserById(int id);
    void createUser(User user);
    void deleteUser(int id);
}
