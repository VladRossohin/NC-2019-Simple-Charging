package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.dto.BillingAccountDto;
import com.netcracker.edu.backend.dto.Converter;
import com.netcracker.edu.backend.entity.BillingAccount;
import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.service.BillingAccountService;
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

@RestController
@RequestMapping(value = "/api/billing-account")
public class BillingAccountsController {
    private BillingAccountService billingAccountService;
    private UserService userService;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public BillingAccountsController(BillingAccountService billingAccountService, UserService userService) {
        this.billingAccountService = billingAccountService;
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Page<BillingAccountDto>> getAllBillingAccounts() {
        return ResponseEntity.ok(billingAccountService.findAll(Pageable.unpaged()).map(Converter::toDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillingAccountDto> getBillingAccountById(@PathVariable long id) {
        BillingAccounts billingAccountsOptional = billingAccountService.findById(id);
        return ResponseEntity.ok(Converter.toDto(billingAccountsOptional));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Page<BillingAccountDto>> getBillingAccountsByUserId(@PathVariable long id) {
        return ResponseEntity.ok(billingAccountService.findAllByUsersByUserIdId(id, Pageable.unpaged()).map(Converter::toDto));
    }

    @GetMapping("/user/login/{login}")
    public ResponseEntity<Page<BillingAccountDto>> getBillingAccountsByUserLogin(@PathVariable String login) {
        return ResponseEntity.ok(billingAccountService.findAllByUsersByUserIdLogin(login, Pageable.unpaged()).map(Converter::toDto));
    }

/*

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BillingAccountDto> getBillingAccountById(@PathVariable(name = "id") long id) {

        BillingAccount billingAccount = billingAccountService.findById(id);
        BillingAccountDto billingAccountDto = modelMapper.map(billingAccount, BillingAccountDto.class);
        return ResponseEntity.ok(billingAccountDto);

    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public List<BillingAccountDto> getBillingAccountsByUserId(@PathVariable(name = "id") long id) {
        List<BillingAccount> billingAccounts = billingAccountService.findByUserId(id);
        Type typeList = new TypeToken<List<BillingAccountDto>>(){}.getType();
        List<BillingAccountDto> billingAccountDto = modelMapper.map(billingAccounts,typeList);
        return billingAccountDto;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BillingAccountDto> getAllBillingAccounts() {
        List<BillingAccount> billingAccounts = billingAccountService.findAll();
        Type typeList = new TypeToken<List<BillingAccountDto>>(){}.getType();
        List<BillingAccountDto> billingAccountDto = modelMapper.map(billingAccounts, typeList);
        return billingAccountDto;
    }
*/


    @RequestMapping(method = RequestMethod.POST)
    public BillingAccounts saveBillingAccount(@RequestBody BillingAccountDto billingAccountDto) {
        return billingAccountService.save(Converter.fromDto(billingAccountDto));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBillingAccount(@PathVariable(name = "id") long id) {
        billingAccountService.delete(id);
    }

    @DeleteMapping("{login}")
    public void deleteBillingAccountByUserLogin(@PathVariable String login) {
        billingAccountService.deleteByUserLogin(login);
    }
}

