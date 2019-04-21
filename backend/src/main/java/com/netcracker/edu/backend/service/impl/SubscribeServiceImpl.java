package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Subscribe;
import com.netcracker.edu.backend.repository.SubscribeRepository;
import com.netcracker.edu.backend.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscribeServiceImpl implements SubscribeService {


    @Autowired
    private SubscribeRepository subscribeRepository;

    @Override
    public List<Subscribe> findAll() {
        return (List<Subscribe>) subscribeRepository.findAll();
    }

    @Override
    public Optional<Subscribe> findById(long subscribeId) {
        return (Optional<Subscribe>) subscribeRepository.findById(subscribeId);
    }

    @Override
    public Subscribe save(Subscribe subscribe) {
        return subscribeRepository.save(subscribe);
    }

    @Override
    public void delete(long id) {
        subscribeRepository.deleteById(id);
    }
}
