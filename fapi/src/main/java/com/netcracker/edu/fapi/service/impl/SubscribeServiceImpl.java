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

    @Override
    public Subscribe save(Subscribe subscribe) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/subscribe/", subscribe, Subscribe.class).getBody();
    }

    @Override
    public void deleteById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/subscribe/" + id);
    }

    @Override
    public void deleteByBaNumber(String number) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/subscribe/ba/" + number);
    }

    @Override
    public void deleteByUserLogin(String login) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "api/subscribe/user/" + login);
    }

    @Override
    public void deleteByServiceId(long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/subscribe/service/" + id);
    }
}
