package com.netcracker.edu.fapi.service.impl;
/*
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import com.netcracker.edu.fapi.models.User;
import com.netcracker.edu.fapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
/*import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service(/*"customDetailsService"*/)
public class UserServiceImpl implements/* UserDetailsService, */UserService {

    @Value("http://localhost:8080/")
    private String backendServerUrl;

   /* @Override
    public User findByLogin(String login) {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(backendServerUrl + "/api/users/login/" + login, User.class);
        return user;
    }
*/
    @Override
    public List<User> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        User[] usersResponse = restTemplate.getForObject(backendServerUrl + "/api/users", User[].class );
        return usersResponse == null ? Collections.emptyList() : Arrays.asList(usersResponse);
    }

    /*@Override
    public User save(User user) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }*/
}
