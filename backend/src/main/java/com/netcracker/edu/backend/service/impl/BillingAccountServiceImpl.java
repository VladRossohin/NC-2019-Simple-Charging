package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.BillingAccount;
import com.netcracker.edu.backend.repository.BillingAccountRepository;
import com.netcracker.edu.backend.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillingAccountServiceImpl implements BillingAccountService {

    @Autowired
    private BillingAccountRepository billingAccountRepository;

    @Override
    public List<BillingAccount> findAll() {
        return (List<BillingAccount>) billingAccountRepository.findAll();
    }

    @Override
    public BillingAccount findById(long id) {
        return billingAccountRepository.findById(id);
    }

    @Override
    public List<BillingAccount> findByUserId(long userId) {
        return (List<BillingAccount>)billingAccountRepository.findByUserId(userId);
    }

    @Override
    public BillingAccount save(BillingAccount billingAccount) {
        return billingAccountRepository.save(billingAccount);
    }

    @Override
    public void delete(long id) {
        billingAccountRepository.deleteById(id);
    }
}
