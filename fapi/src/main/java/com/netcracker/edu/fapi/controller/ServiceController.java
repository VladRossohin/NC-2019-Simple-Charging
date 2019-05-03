package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Service;
import com.netcracker.edu.fapi.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public Object getAllServices() {
        return serviceService.findAll();
    }

    @GetMapping("{id}")
    public Service getServiceById(@PathVariable long id) {
        return serviceService.findById(id);
    }

    @GetMapping("/user/{id}")
    public Object getServiceByUserId(@PathVariable long id) {
        return serviceService.findByUserId(id);
    }

    @GetMapping("/user/login/{login}")
    public Object getServiceByUserLogin(@PathVariable String login) {
        return serviceService.findByUserLogin(login);
    }

    @PostMapping
    public Service saveService(@RequestBody Service service) {
        if(service != null) {
            return serviceService.saveService(service);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteServiceById(@PathVariable(name="id") long id){
        serviceService.deleteById(id);
    }

    @DeleteMapping("/user/{login}")
    public void deleteServiceByUserLogin(@PathVariable String login) {
        serviceService.deleteByUserLogin(login);
    }
}
