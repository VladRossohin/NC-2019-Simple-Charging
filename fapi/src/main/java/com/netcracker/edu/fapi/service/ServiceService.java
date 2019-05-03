package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Service;

import java.util.List;

public interface ServiceService {
    Object findAll();
    Service findById(long id);
    Object findByUserId(long id);
    Object findByUserLogin(String login);
    Service saveService(Service service);
    void deleteById(long id);

}
