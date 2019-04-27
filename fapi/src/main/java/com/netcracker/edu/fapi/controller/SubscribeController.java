package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Subscribe;
import com.netcracker.edu.fapi.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/subscribe")
public class SubscribeController {
    @Autowired
    private SubscribeService subscribeService;

    @GetMapping
    public List<Subscribe> getAllSubscribes() {
        return subscribeService.findAll();
    }
}
