package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Subscribe;
import com.netcracker.edu.fapi.service.SubscribeService;
import org.springframework.beans.factory.annotation.Value;
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
    public List<Subscribe> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Subscribe[] subscribeResponse = restTemplate.getForObject(backendServerUrl + "/api/subscribe", Subscribe[].class);
        return subscribeResponse == null ? Collections.emptyList() : Arrays.asList(subscribeResponse);
    }
}
