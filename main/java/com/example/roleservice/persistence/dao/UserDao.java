package com.example.roleservice.persistence.dao;

import com.example.roleservice.persistence.entity.User;

public interface UserDao {


    User createUser(User user);

    User getUserById(long userId);

    User getUserByUsername(String username);
}
