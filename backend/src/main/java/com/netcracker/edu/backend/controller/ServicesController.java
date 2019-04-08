package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/services")
public class ServicesController {

    private ServicesService servicesService;

    @Autowired
    public ServicesController(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Services> getServiceById(@PathVariable(name = "id") Long id) {

        Optional<Services> service = servicesService.findById(id);

        if(service.isPresent()) {
            return ResponseEntity.ok(service.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Services> getAllServices() {
        return servicesService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Services saveService(@RequestBody Services service) {
        return servicesService.save(service);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteService(@PathVariable(name = "id") Long id) {
        servicesService.delete(id);
    }

}
