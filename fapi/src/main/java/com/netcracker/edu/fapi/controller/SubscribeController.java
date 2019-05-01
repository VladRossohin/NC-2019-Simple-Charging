package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Subscribe;
import com.netcracker.edu.fapi.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/subscribe")
public class SubscribeController {
    @Autowired
    private SubscribeService subscribeService;

    @GetMapping("/user/login/{login}")
    public Object getSubscribeByUserLogin(@PathVariable String login) {
        return subscribeService.findByUserLogin(login);
    }

    @GetMapping
    public Object getAllSubscribes() {
        return subscribeService.findAll();
    }
}
