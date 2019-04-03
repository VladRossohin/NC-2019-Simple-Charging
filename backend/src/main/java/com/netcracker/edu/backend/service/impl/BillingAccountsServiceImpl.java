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
    public Optional<BillingAccounts> findById(Long id) {
        return billingAccountsRepository.findById(id);
    }

    @Override
    public Optional<BillingAccounts>findByUser(Users userId) {
        return billingAccountsRepository.findByUser(userId);
    }

    @Override
    public BillingAccounts save(BillingAccounts billingAccount) {
        return billingAccountsRepository.save(billingAccount);
    }

    @Override
    public void delete(Long id) {
        billingAccountsRepository.deleteById(id);
    }
}
