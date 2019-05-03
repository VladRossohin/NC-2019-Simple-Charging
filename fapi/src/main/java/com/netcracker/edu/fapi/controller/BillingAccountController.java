package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.BillingAccount;
import com.netcracker.edu.fapi.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/billing-account")
public class BillingAccountController {
    @Autowired
    private BillingAccountService billingAccountService;

    @GetMapping
    public Object getAllBillingAccounts() {
        return billingAccountService.findAll();
    }

    @GetMapping("{id}")
    public BillingAccount getBillingAccountById(@PathVariable(name = "id") long id) {
        return billingAccountService.findById(id);
    }

    @GetMapping("/user/{id}")
    public Object getBillingAccountByUserId(@PathVariable(name = "id") long id) {
        return billingAccountService.findByUserId(id);
    }

    @GetMapping("/user/login/{login}")
    public Object getBillingAccountsByUserLogin(@PathVariable(name="login") String login) {
        return billingAccountService.findByUserLogin(login);
    }

    @PostMapping
    public BillingAccount saveBillingAccount(@RequestBody BillingAccount billingAccount) {
        if(billingAccount != null) {
            return billingAccountService.save(billingAccount);
        }
        return null;
    }

    @DeleteMapping("/{login}")
    public void deleteByUserLogin(@PathVariable String login) {
        billingAccountService.deleteByUserLogin(login);
    }
}
