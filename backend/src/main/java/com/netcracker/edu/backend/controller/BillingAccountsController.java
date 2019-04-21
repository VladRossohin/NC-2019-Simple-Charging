package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.dto.BillingAccountDto;
import com.netcracker.edu.backend.entity.BillingAccount;
import com.netcracker.edu.backend.service.BillingAccountService;
import com.netcracker.edu.backend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BillingAccountDto> getBillingAccountById(@PathVariable(name = "id") long id) {

        BillingAccount billingAccount = billingAccountService.findById(id);
        BillingAccountDto billingAccountDto = modelMapper.map(billingAccount, BillingAccountDto.class);
        billingAccountDto.setUser(userService.findById(billingAccount.getUserId()).getLogin());
        return ResponseEntity.ok(billingAccountDto);

    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public List<BillingAccount> getBillingAccountsByUserId(@PathVariable(name = "id") long id) {
        List<BillingAccount> billingAccounts = billingAccountService.findByUserId(id);

        return billingAccounts;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BillingAccount> getAllBillingAccounts() {
        return billingAccountService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public BillingAccount saveBillingAccount(@RequestBody BillingAccount account) {
        return billingAccountService.save(account);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBillingAccount(@PathVariable(name = "id") Long id) {
        billingAccountService.delete(id);
    }
}

