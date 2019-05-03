package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.User;
import com.netcracker.edu.fapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping
    public User saveUser(@RequestBody User user) {
        if(user != null) {
            return userService.save(user);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable long id) {
        userService.delete(id);
    }

    @DeleteMapping("/login/{login}")
    public void deleteUserByLogin(@PathVariable String login) {
        userService.deleteByLogin(login);
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
