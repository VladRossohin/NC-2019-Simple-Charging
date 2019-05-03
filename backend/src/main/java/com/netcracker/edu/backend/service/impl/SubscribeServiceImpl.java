package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Subscribe;
import com.netcracker.edu.backend.entity.Subscribes;
import com.netcracker.edu.backend.repository.SubscribeRepository;
import com.netcracker.edu.backend.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscribeServiceImpl implements SubscribeService {

    @Autowired
    private SubscribeRepository subscribeRepository;

    @Override
    public Page<Subscribes> findAll(Pageable pageable) {
        return subscribeRepository.findAll(pageable);
    }

    @Override
    public Optional<Subscribes> findById(long id) {
        return subscribeRepository.findById(id);
    }

    @Override
    public Page<Subscribes> findAllByUsersByUserIdId(long userId, Pageable pageable) {
        return subscribeRepository.findAllByUsersByUserIdId(userId, pageable);
    }

    @Override
    public Page<Subscribes> findAllByUsersByUserIdLogin(String login, Pageable pageable) {
        return subscribeRepository.findAllByUsersByUserIdLogin(login, pageable);
    }

    @Override
    public Subscribes save(Subscribes subscribe) {
        return subscribeRepository.save(subscribe);
    }

    @Override
    public void delete(long id) {
        subscribeRepository.deleteById(id);
    }

    @Override
    public void deleteByBaNumber(String number) {
        subscribeRepository.deleteAllByBillingAccountsByBaIdNumber(number);
    }

    @Override
    public void deleteByUserLogin(String login) {
        subscribeRepository.deleteAllByUsersByUserIdLogin(login);
    }

    @Override
    public void deleteByServiceId(long id) {
        subscribeRepository.deleteAllByServicesByServiceIdId(id);
    }
}