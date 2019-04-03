package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillingAccountsService {

    List<BillingAccounts> findAll();
    BillingAccounts findByUser(Users userId);
    BillingAccounts save(BillingAccounts billingAccount);
    void delete(Long id);


}
