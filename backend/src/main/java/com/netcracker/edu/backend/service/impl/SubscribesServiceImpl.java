package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Subscribes;
import com.netcracker.edu.backend.repository.SubscribesRepository;
import com.netcracker.edu.backend.service.SubscribesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscribesServiceImpl implements SubscribesService {


    @Autowired
    private SubscribesRepository subscribesRepository;

    @Override
    public List<Subscribes> findAll() {
        return (List<Subscribes>)subscribesRepository.findAll();
    }

    @Override
    public Optional<Subscribes> findById(Long subscribeId) {
        return subscribesRepository.findById(subscribeId);
    }

    @Override
    public Subscribes save(Subscribes subscribe) {
        return subscribesRepository.save(subscribe);
    }

    @Override
    public void delete(Long id) {
        subscribesRepository.deleteById(id);
    }
}
