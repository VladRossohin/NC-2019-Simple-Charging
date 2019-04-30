package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.dto.Converter;
import com.netcracker.edu.backend.dto.ServiceDto;
import com.netcracker.edu.backend.entity.Service;
import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.service.ServiceService;
import com.netcracker.edu.backend.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @GetMapping
    public ResponseEntity<Page<ServiceDto>> getAllServices() {
        return ResponseEntity.ok(serviceService.findAll(Pageable.unpaged()).map(Converter::toDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceDto> getServiceById(@PathVariable long id) {
        Optional<Services> servicesOptional = serviceService.findById(id);
        if (!servicesOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Converter.toDto(servicesOptional.get()));
    }

    @GetMapping("/user/{id}")
    public List<String> getServiceByUserId(@PathVariable long id) {
        List<Services> services = serviceService.findAllByUsersByUserIdId(id);
        List<String> servicesName = services.stream().map(Services::getName).collect(Collectors.toList());
        return servicesName;

    }


    /*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ServiceDto> getServiceById(@PathVariable(name = "id") long id) {
        Optional<Services> service = serviceService.findById(id);
        Type serviceType = new TypeToken<ServiceDto>(){}.getType();
        ServiceDto serviceDto = modelMapper.map(service, serviceType);
        return ResponseEntity.ok(serviceDto);

    }*/
/*
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ServiceDto> getAllServices() {
        Type listType = new TypeToken<List<ServiceDto>>(){}.getType();
        List<Services> service = serviceService.findAll();
        List<ServiceDto> serviceDto = modelMapper.map(service, listType);
        return serviceDto;
    }*/

/*
    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public List<ServiceDto> getServicesByUserId(@PathVariable(name = "id")long id) {
        List<Services> service = serviceService.findByUsersByUserId(id);
        Type listType = new TypeToken<List<ServiceDto>>(){}.getType();
        List<ServiceDto> serviceDto = modelMapper.map(service, listType);
        return serviceDto;
    }
*/

    @RequestMapping(method = RequestMethod.POST)
    public Services saveService(@RequestBody ServiceDto serviceDto) {
        return serviceService.save(Converter.fromDto(serviceDto));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteService(@PathVariable(name = "id") Long id) {
        serviceService.delete(id);
    }

}
