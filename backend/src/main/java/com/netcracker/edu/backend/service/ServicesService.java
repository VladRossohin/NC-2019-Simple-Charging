package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.repository.ServicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ServicesService {

    List<Services> findAll();
    Optional<Services> findById(Long id);
    Optional<Services> findByUser(Users userId);
    Services save(Services service);
    void delete(Long id);
}
