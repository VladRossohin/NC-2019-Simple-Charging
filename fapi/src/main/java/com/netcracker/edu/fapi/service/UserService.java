package com.netcracker.edu.fapi.service;


import com.netcracker.edu.fapi.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(long id);
    User findByLogin(String login);
}
