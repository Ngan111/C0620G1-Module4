package com.codegym.signin.service;

import com.codegym.signin.entity.User;


import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    void save(User user);

    void update(User user);

    void remove(int id);
}

