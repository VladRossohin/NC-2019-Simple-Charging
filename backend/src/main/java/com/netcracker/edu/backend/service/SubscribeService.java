package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Subscribe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SubscribeService {

    List<Subscribe> findAll();
    Optional<Subscribe> findById(long subscribeId);
    Subscribe save(Subscribe subscribe);
    void delete(long id);
}
