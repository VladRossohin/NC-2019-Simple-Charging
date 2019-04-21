package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();
    User findByLogin(String login);
    User findById(long id);
    User save(User user);
    void delete(long id);

}
