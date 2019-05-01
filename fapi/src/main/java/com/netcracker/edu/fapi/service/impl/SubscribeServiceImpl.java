package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Subscribe;
import com.netcracker.edu.fapi.service.SubscribeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SubscribeServiceImpl implements SubscribeService {

    @Value("http://localhost:8080/")
    private String backendServerUrl;


    @Override
    public Object findByUserLogin(String login) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(backendServerUrl + "/api/subscribe/user/login/" + login, Object.class));
    }

    @Override
    public List<Object> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(backendServerUrl + "/api/subscribe", Object.class));
    }
}
