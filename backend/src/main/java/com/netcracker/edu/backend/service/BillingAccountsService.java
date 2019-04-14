package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BillingAccountsService {

    List<BillingAccounts> findAll();
    Optional<BillingAccounts> findById(long id);
    Optional<BillingAccounts> findByUserId(long userId);
    BillingAccounts save(BillingAccounts billingAccount);
    void delete(long id);


}
