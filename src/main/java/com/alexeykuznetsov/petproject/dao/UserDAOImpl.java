package com.alexeykuznetsov.petproject.dao;

import com.alexeykuznetsov.petproject.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> showAllUsers() {
        Session session = entityManager.unwrap(Session.class);
        List<User> userList = session.createQuery("from users", User.class).getResultList();
        return userList;
    }

    @Override
    public User getUserById(int id) {
        Session session = entityManager.unwrap(Session.class);
        User user = session.get(User.class, id);
        return user;
    }

    @Override
    public void createUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(int id) {

    }
}
