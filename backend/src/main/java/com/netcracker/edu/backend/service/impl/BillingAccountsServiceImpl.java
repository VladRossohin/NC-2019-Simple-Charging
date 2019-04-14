package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.entity.Users;
import com.netcracker.edu.backend.repository.BillingAccountsRepository;
import com.netcracker.edu.backend.service.BillingAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillingAccountsServiceImpl implements BillingAccountsService {

    @Autowired
    private BillingAccountsRepository billingAccountsRepository;

    @Override
    public List<BillingAccounts> findAll() {
        return (List<BillingAccounts>)billingAccountsRepository.findAll();
    }

    @Override
    public Optional<BillingAccounts> findById(long id) {
        return (Optional<BillingAccounts>)billingAccountsRepository.findById(id);
    }

    @Override
    public Optional<BillingAccounts> findByUserId(long userId) {
        return (Optional<BillingAccounts>)billingAccountsRepository.findByUserId(userId);
    }

    @Override
    public BillingAccounts save(BillingAccounts billingAccount) {
        return billingAccountsRepository.save(billingAccount);
    }

    @Override
    public void delete(long id) {
        billingAccountsRepository.deleteById(id);
    }
}
