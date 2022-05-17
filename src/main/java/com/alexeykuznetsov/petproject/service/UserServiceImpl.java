package com.alexeykuznetsov.petproject.service;

import com.alexeykuznetsov.petproject.dao.UserDAO;
import com.alexeykuznetsov.petproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> showAllUsers() {
        return userDAO.showAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
