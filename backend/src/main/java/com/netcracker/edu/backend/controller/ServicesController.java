package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.dto.ServiceDto;
import com.netcracker.edu.backend.entity.Service;
import com.netcracker.edu.backend.service.ServiceService;
import com.netcracker.edu.backend.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/service")
public class ServicesController {

    private ServiceService serviceService;
    private UserService userService;
    @Autowired
    public ServicesController(ServiceService serviceService, UserService userService) {
        this.serviceService = serviceService;
        this.userService = userService;
    }
    private ModelMapper modelMapper = new ModelMapper();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ServiceDto> getServiceById(@PathVariable(name = "id") long id) {
        Service service = serviceService.findById(id);
        ServiceDto serviceDto = modelMapper.map(service, ServiceDto.class);
        serviceDto.setUser(userService.findById(service.getUserId()).getLogin());
        return ResponseEntity.ok(serviceDto);

    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ServiceDto> getAllServices() {
        Type listType = new TypeToken<List<ServiceDto>>(){}.getType();
        List<Service> service = serviceService.findAll();
        List<ServiceDto> serviceDto = modelMapper.map(service, listType);
        return serviceDto;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Optional<Service> getServicesByUserId(@PathVariable(name = "id") long id) {
        return serviceService.findByUserId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Service saveService(@RequestBody Service service) {
        return serviceService.save(service);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteService(@PathVariable(name = "id") Long id) {
        serviceService.delete(id);
    }

}
