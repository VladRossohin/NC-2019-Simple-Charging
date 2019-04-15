package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.BillingAccount;

import java.util.List;

public interface BillingAccountService {
    List<BillingAccount> findAll();
    BillingAccount findById(long id);
    List<BillingAccount> findByUserId(long id);


}
