package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Subscribe;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SubscribeService  {
    Object findAll();
    Object findByUserLogin(String login);


}
