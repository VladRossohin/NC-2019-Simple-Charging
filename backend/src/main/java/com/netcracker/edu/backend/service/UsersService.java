package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Users;

import java.util.List;

public interface UsersService {

    List<Users> findAll();
    Users findByLogin(String login);
    Users save(Users user);
    void delete(Long id);

}
