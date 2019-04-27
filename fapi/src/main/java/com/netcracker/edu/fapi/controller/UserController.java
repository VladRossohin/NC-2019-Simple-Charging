package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.User;
import com.netcracker.edu.fapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Object getAllUsers() {
        return userService.findAll();
    }

    @GetMapping ("{id}")
    public User getUserById (@PathVariable long id) {
        return userService.findById(id);
    }

    @GetMapping ("/login/{login}")
    public User getUserByLogin (@PathVariable String login) {
        return userService.findByLogin(login);
    }

 /*   @GetMapping("/login/{login}")
    public User getUserByLogin (@PathVariable String login) {
        return userService.findByLogin(login);
    }*/
/*
    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }*/
}
