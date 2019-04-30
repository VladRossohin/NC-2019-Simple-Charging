package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public interface ServiceService {

    Page<Services> findAll(Pageable pageable);
    List<Services> findAll();
    Optional<Services> findById(long id);
    List<Services> findByUsersByUserId(long id);
    List<Services> findAllByUsersByUserIdId(long id);
    Services findByName(String name);
    Services save(Services service);
    void delete(long id);
}
