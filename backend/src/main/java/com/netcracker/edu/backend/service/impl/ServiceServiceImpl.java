package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.repository.ServiceRepository;
import com.netcracker.edu.backend.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Services> findAllByUsersByUserIdLogin(String login, Pageable pageable) {
        return serviceRepository.findAllByUsersByUserIdLogin(login, pageable);
    }

    @Override
    public List<Services> findAll() {
        return (List<Services>) serviceRepository.findAll();
    }

    @Override
    public Services findById(long id) {
        return serviceRepository.findById(id);
    }

    @Override
    public List<Services> findByUsersByUserId(long id) {
        return serviceRepository.findByUsersByUserId(id);
    }

    @Override
    public List<Services> findAllByUsersByUserIdId(long id) {
        return serviceRepository.findAllByUsersByUserIdId(id);
    }

    @Override
    public Services findByName(String name) {
        return serviceRepository.findByName(name);
    }

    @Override
    public Services save(Services service) {
        return serviceRepository.save(service);
    }

    @Override
    public void delete(long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void deleteByUserLogin(String login) {
        serviceRepository.deleteAllByUsersByUserIdLogin(login);
    }
}
