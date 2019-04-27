package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Service;
import com.netcracker.edu.fapi.models.User;
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
    public List<Object> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(backendServerUrl + "/api/service", Object.class));
    }

    @Override
    public Service findById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        Service serviceResponse = restTemplate.getForObject(backendServerUrl + "/api/service/" + id, Service.class);
        return serviceResponse;
    }

    @Override
    public Object findByUserId(long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/service/user/" + id, Object.class);
    }
}
