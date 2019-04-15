package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Service;
import com.netcracker.edu.fapi.service.ServiceService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Value("http://localhost:8080/")
    private String backendServerUrl;

    @Override
    public List<Service> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Service[] serviceResponse = restTemplate.getForObject(backendServerUrl + "/api/service", Service[].class);
        return serviceResponse == null ? Collections.emptyList() : Arrays.asList(serviceResponse);
    }

    @Override
    public Service findById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        Service serviceResponse = restTemplate.getForObject(backendServerUrl + "/api/service/" + id, Service.class);
        return serviceResponse;
    }

    @Override
    public Service findByUserId(long id) {
        RestTemplate restTemplate = new RestTemplate();
        Service serviceResponse = restTemplate.getForObject(backendServerUrl + "/api/service/user/" + id, Service.class);
        return serviceResponse;
    }
}
