package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.Subscribe;
import com.netcracker.edu.backend.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/subscribes")
public class SubscribesController {

    private SubscribeService subscribeService;

    @Autowired
    public SubscribesController(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Subscribe> getSubscribeById(@PathVariable(name = "id") Long id) {

        Optional<Subscribe> subscribe = subscribeService.findById(id);

        if(subscribe.isPresent()) {
            return ResponseEntity.ok(subscribe.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Subscribe> getAllSubscribes() {
        return subscribeService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Subscribe saveSubscribe(@RequestBody Subscribe subscribe) {
        return subscribeService.save(subscribe);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSubscribe(@PathVariable(name = "id") Long id) {
        subscribeService.delete(id);
    }


}
