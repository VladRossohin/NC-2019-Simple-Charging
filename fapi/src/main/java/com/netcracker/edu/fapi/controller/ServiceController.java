package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Service;
import com.netcracker.edu.fapi.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getAllServices() {
        return serviceService.findAll();
    }

    @GetMapping("{id}")
    public Service getServiceById(@PathVariable long id) {
        return serviceService.findById(id);
    }

    @GetMapping("/user/{id}")
    public Service getServiceByUserId(@PathVariable long id) {
        return serviceService.findByUserId(id);
    }
}
