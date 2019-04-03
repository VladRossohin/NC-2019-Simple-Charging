package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.repository.UsersRepository;
import com.netcracker.edu.backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> findAll() {
        return (List<Users>)usersRepository.findAll();
    }

    @Override
    public Users findByLogin(String login) {
        return usersRepository.findByLogin(login);
    }

    @Override
    public Users save(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);
    }
}
