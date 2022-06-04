package com.alexeykuznetsov.petproject.dao;

import com.alexeykuznetsov.petproject.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> showAllUsers();
    User getUserById(Long id);
    void deleteUser(Long id);
}
