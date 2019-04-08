package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.service.BillingAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/billing-accounts")
public class BillingAccountsController {
    private BillingAccountsService billingAccountsService;

    @Autowired
    public BillingAccountsController(BillingAccountsService billingAccountsService) {
        this.billingAccountsService = billingAccountsService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BillingAccounts> getBillingAccountById(@PathVariable(name = "id") Long id) {

        Optional<BillingAccounts> billingAccount = billingAccountsService.findById(id);

        if (billingAccount.isPresent()) {
            return ResponseEntity.ok(billingAccount.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BillingAccounts> getAllBillingAccounts() {
        return billingAccountsService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public BillingAccounts saveBillingAccount(@RequestBody BillingAccounts account) {
        return billingAccountsService.save(account);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBillingAccount(@PathVariable(name = "id") Long id) {
        billingAccountsService.delete(id);
    }
}

