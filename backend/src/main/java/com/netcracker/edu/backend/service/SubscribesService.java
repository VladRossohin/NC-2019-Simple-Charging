package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Subscribes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscribesService {

    List<Subscribes> findAll();
    Subscribes findById(Long subscribeId);
    Subscribes save(Subscribes subscribe);
    void delete(Long id);
}
