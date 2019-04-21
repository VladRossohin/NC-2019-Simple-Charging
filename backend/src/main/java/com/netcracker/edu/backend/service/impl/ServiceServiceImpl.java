package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Service;
import com.netcracker.edu.backend.repository.ServiceRepository;
import com.netcracker.edu.backend.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<Service> findAll() {
        return (List<Service>) serviceRepository.findAll();
    }

    @Override
    public Service findById(long id) {
        return serviceRepository.findById(id);
    }

    @Override
    public Optional<Service> findByUserId(long userId) {
        return (Optional<Service>) serviceRepository.findByUserId(userId);
    }

    @Override
    public Service save(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public void delete(long id) {
        serviceRepository.deleteById(id);
    }
}
