package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.Subscribes;
import com.netcracker.edu.backend.service.SubscribesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/subscribes")
public class SubscribesController {

    private SubscribesService subscribesService;

    @Autowired
    public SubscribesController(SubscribesService subscribesService) {
        this.subscribesService = subscribesService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Subscribes> getSubscribeById(@PathVariable(name = "id") Long id) {

        Optional<Subscribes> subscribe = subscribesService.findById(id);

        if(subscribe.isPresent()) {
            return ResponseEntity.ok(subscribe.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Subscribes> getAllSubscribes() {
        return subscribesService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Subscribes saveSubscribe(@RequestBody Subscribes subscribe) {
        return subscribesService.save(subscribe);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSubscribe(@PathVariable(name = "id") Long id) {
        subscribesService.delete(id);
    }


}
