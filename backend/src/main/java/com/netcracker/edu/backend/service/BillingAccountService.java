package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.BillingAccount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BillingAccountService {

    List<BillingAccount> findAll();
    BillingAccount findById(long id);
    List<BillingAccount> findByUserId(long userId);
    BillingAccount save(BillingAccount billingAccount);
    void delete(long id);


}
