package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.BillingAccount;
import com.netcracker.edu.fapi.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/billing-account")
public class BillingAccountController {
    @Autowired
    private BillingAccountService billingAccountService;

    @GetMapping
    public List<BillingAccount> getAllBillingAccounts() {
        return billingAccountService.findAll();
    }

    @GetMapping("{id}")
    public BillingAccount getBillingAccountById(@PathVariable(name = "id") long id) {
        return billingAccountService.findById(id);
    }

    @GetMapping("/user/{id}")
    public List<BillingAccount> getBillingAccountByUserId(@PathVariable(name = "id") long id) {
        return billingAccountService.findByUserId(id);
    }
}
