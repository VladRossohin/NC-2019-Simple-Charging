package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.BillingAccount;

import java.util.List;

public interface BillingAccountService {
    Object findAll();
    BillingAccount findById(long id);
    Object findByUserId(long id);
    Object findByUserLogin(String login);
    BillingAccount save(BillingAccount billingAccount);
    void deleteByUserLogin(String login);

}
