package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.repository.BillingAccountRepository;
import com.netcracker.edu.backend.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillingAccountServiceImpl implements BillingAccountService {

    @Autowired
    private BillingAccountRepository billingAccountRepository;

    @Override
    public Page<BillingAccounts> findAll(Pageable pageable) {
        return billingAccountRepository.findAll(pageable);
    }

    @Override
    public Page<BillingAccounts> findAllByUsersByUserIdId(long userId, Pageable pageable) {
        return billingAccountRepository.findAllByUsersByUserIdId(userId, pageable);
    }

    @Override
    public Optional<BillingAccounts> findById(long id) {
        return billingAccountRepository.findById(id);
    }

    @Override
    public BillingAccounts save(BillingAccounts billingAccount) {
        return null;
    }

    @Override
    public void delete(long id) {
        billingAccountRepository.deleteById(id);
    }
}
