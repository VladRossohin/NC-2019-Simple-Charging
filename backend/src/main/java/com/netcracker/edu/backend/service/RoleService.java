package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role> findAll();
    Role findById(long id);
    Role findByRole(String role);

}
