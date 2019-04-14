package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Subscribes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SubscribesService {

    List<Subscribes> findAll();
    Optional<Subscribes> findById(long subscribeId);
    Subscribes save(Subscribes subscribe);
    void delete(long id);
}
