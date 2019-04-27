package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.User;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Page<Users> findAll (Pageable pageable);
    List<Users> findAll (Sort sort);
    List<Users> findAll();
    Users findByLogin(String login);
    Optional<Users> findById(long id);
    Users save(Users user);
    void delete(long id);

}
