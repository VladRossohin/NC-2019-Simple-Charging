package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.dto.UserDto;
import com.netcracker.edu.backend.entity.User;
import com.netcracker.edu.backend.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UsersController {

    @Autowired
    private UserService userService;

    private ModelMapper modelMapper = new ModelMapper();

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUserByLogin(@PathVariable(name="login") String login) {

        User user = userService.findByLogin(login);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return ResponseEntity.ok(userDto);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<UserDto> getAllUsers() {
        Type listType = new TypeToken<List<UserDto>>(){}.getType();
        List<User> users = userService.findAll();
        List<UserDto> userDto = modelMapper.map(users, listType);

        return userDto;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.delete(id);
    }



}
