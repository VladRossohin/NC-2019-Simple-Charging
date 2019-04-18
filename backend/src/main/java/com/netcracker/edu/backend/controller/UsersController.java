package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.dto.UsersDTO;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public ResponseEntity<UsersDTO> getUserByLogin(@PathVariable(name="login") String login) {

        Users user = usersService.findByLogin(login);
        return ResponseEntity.ok(user.convertToDto());
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return usersService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Users saveUser(@RequestBody Users user) {
        return usersService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(name = "id") Long id) {
        usersService.delete(id);
    }



}
