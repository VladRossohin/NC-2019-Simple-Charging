package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Role;
import com.netcracker.edu.backend.entity.Roles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Roles> findAll();
    Roles findById(long id);
    Roles findByRole(String role);

}
