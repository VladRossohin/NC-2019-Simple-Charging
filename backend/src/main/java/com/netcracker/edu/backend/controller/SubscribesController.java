package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.dto.Converter;
import com.netcracker.edu.backend.dto.SubscribeDto;
import com.netcracker.edu.backend.entity.Subscribes;
import com.netcracker.edu.backend.service.SubscribeService;
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

@RestController
@RequestMapping(value = "/api/subscribe")
public class SubscribesController {

    private SubscribeService subscribeService;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public SubscribesController(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }

    @GetMapping
    public ResponseEntity<Page<SubscribeDto>> getAllSubscribes() {
        return ResponseEntity.ok(subscribeService.findAll(Pageable.unpaged()).map(Converter::toDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscribeDto> getSubscribeById(@PathVariable long id) {
        Optional<Subscribes> subscribesOptional = subscribeService.findById(id);
        if(!subscribesOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Converter.toDto(subscribesOptional.get()));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Page<SubscribeDto>> getSubscribesByUserId(@PathVariable long id){
        return ResponseEntity.ok(subscribeService.findAllByUsersByUserIdId(id, Pageable.unpaged()).map(Converter::toDto));
    }

    @GetMapping("/user/login/{login}")
    public ResponseEntity<Page<SubscribeDto>> getSubscribeByUserLogin(@PathVariable String login) {
        return ResponseEntity.ok(subscribeService.findAllByUsersByUserIdLogin(login, Pageable.unpaged()).map(Converter::toDto));
    }

    /*

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Subscribes> getSubscribeById(@PathVariable(name = "id") Long id) {

        Optional<Subscribes> subscribe = subscribeService.findById(id);

        if(subscribe.isPresent()) {
            return ResponseEntity.ok(subscribe.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<SubscribeDto> getAllSubscribes() {

        List<Subscribes> subscribes = subscribeService.findAll();
        Type listType = new TypeToken<List<SubscribeDto>>(){}.getType();
        List<SubscribeDto>subscribeDto = modelMapper.map(subscribes, listType);
        return subscribeDto;
    }
*/

    @RequestMapping(method = RequestMethod.POST)
    public Subscribes saveSubscribe(@RequestBody SubscribeDto subscribeDto) {
        return subscribeService.save(Converter.fromDto(subscribeDto));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSubscribe(@PathVariable(name = "id") Long id) {
        subscribeService.delete(id);
    }


}
