package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Service;

import java.util.List;

public interface ServiceService {
    List<Service> findAll();
    Service findById(long id);
    Service findByUserId(long id);

}
