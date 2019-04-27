package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.dto.Converter;
import com.netcracker.edu.backend.dto.UserDto;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/user")
public class UsersController {

    @Autowired
    private UserService userService;

    private ModelMapper modelMapper = new ModelMapper();

    private Converter converter;

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUserByLogin(@PathVariable(name="login") String login) {

        Users user = userService.findByLogin(login);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return ResponseEntity.ok(userDto);
    }

    /*@RequestMapping(value = "", method = RequestMethod.GET)
    public List<UserDto> getAllUsers() {
        Type listType = new TypeToken<List<UserDto>>(){}.getType();
        List<Users> users = userService.findAll();
        List<UserDto> userDto = modelMapper.map(users, listType);
        return userDto;
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable long id) {
        Optional<Users> usersOptional = userService.findById(id);
        if(!usersOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Converter.toDto(usersOptional.get()));

    }


    @GetMapping
    public ResponseEntity<Page<UserDto>> getAllUsers () {
        return ResponseEntity.ok(userService.findAll(Pageable.unpaged()).map(Converter::toDto));
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Users saveUser(@RequestBody Users user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.delete(id);
    }



}
