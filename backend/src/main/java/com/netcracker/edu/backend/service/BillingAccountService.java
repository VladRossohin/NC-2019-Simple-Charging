package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.BillingAccount;
import com.netcracker.edu.backend.entity.BillingAccounts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BillingAccountService {

    Page<BillingAccounts> findAll(Pageable pageable);
    Page<BillingAccounts> findAllByUsersByUserIdId(long userId, Pageable pageable);
    Page<BillingAccounts> findAllByUsersByUserIdLogin(String login, Pageable pageable);
    BillingAccounts findById(long id);
    BillingAccounts findByNumber(String number);
    BillingAccounts save(BillingAccounts billingAccount);
    void delete(long id);
    void deleteByUserLogin(String login);
    void deleteByNumber(String number);


}
