package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Role;
import com.netcracker.edu.backend.entity.Roles;
import com.netcracker.edu.backend.repository.RoleRepository;
import com.netcracker.edu.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Roles> findAll() {
        return (List<Roles>) roleRepository.findAll();
    }

    @Override
    public Roles findById(long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Roles findByRole(String role) {
        return roleRepository.findByRole(role);
    }
}
