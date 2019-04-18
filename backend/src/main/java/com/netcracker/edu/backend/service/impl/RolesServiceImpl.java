package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Roles;
import com.netcracker.edu.backend.repository.RolesRepository;
import com.netcracker.edu.backend.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public List<Roles> findAll() {
        return (List<Roles>) rolesRepository.findAll();
    }

    @Override
    public Roles findById(long id) {
        return rolesRepository.findById(id);
    }

    @Override
    public Roles findByRole(String role) {
        return rolesRepository.findByRole(role);
    }
}
