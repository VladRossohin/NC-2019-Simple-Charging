package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public interface ServiceService {

    Page<Services> findAll(Pageable pageable);
    Page<Services> findAllByUsersByUserIdLogin(String login, Pageable pageable);
    List<Services> findAll();
    Services findById(long id);
    List<Services> findByUsersByUserId(long id);
    List<Services> findAllByUsersByUserIdId(long id);
    Services findByName(String name);
    Services save(Services service);
    void delete(long id);
    void deleteByUserLogin(String login);
}
