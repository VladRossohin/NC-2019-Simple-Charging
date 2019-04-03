package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.repository.ServicesRepository;
import com.netcracker.edu.backend.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;

    @Override
    public List<Services> findAll() {
        return (List<Services>)servicesRepository.findAll();
    }

    @Override
    public Optional<Services> findById(Long id) {
        return servicesRepository.findById(id);
    }

    @Override
    public Optional<Services> findByUser(Users userId) {
        return servicesRepository.findByUser(userId);
    }

    @Override
    public Services save(Services service) {
        return servicesRepository.save(service);
    }

    @Override
    public void delete(Long id) {
        servicesRepository.deleteById(id);
    }
}
