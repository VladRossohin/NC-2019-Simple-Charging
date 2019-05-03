package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Subscribes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SubscribeService {

    Page<Subscribes> findAll(Pageable pageable);
    Optional<Subscribes> findById(long id);
    Page<Subscribes> findAllByUsersByUserIdId(long userId, Pageable pageable);
    Page<Subscribes> findAllByUsersByUserIdLogin(String login, Pageable pageable);
    Subscribes save(Subscribes subscribe);
    void delete(long id);
    void deleteByBaNumber(String number);
    void deleteByUserLogin(String login);
    void deleteByServiceId(long id);
}
