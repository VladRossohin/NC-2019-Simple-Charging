package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Service;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public interface ServiceService {

    List<Service> findAll();
    Service findById(long id);
    Optional<Service> findByUserId(long userId);
    Service save(Service service);
    void delete(long id);
}
