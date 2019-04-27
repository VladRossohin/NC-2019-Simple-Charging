package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.BillingAccount;
import com.netcracker.edu.fapi.service.BillingAccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class BillingAccountServiceImpl implements BillingAccountService {

    @Value("http://localhost:8080/")
    private String backendServerUrl;

    @Override
    public List<Object> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(backendServerUrl + "api/billing-account", Object.class));
    }

    @Override
    public BillingAccount findById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        BillingAccount billingAccountResponse = restTemplate.getForObject(backendServerUrl + "/api/billing-account/" + id, BillingAccount.class);
        return billingAccountResponse;
    }

    @Override
    public List<Object> findByUserId(long id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(backendServerUrl + "/api/billing-account/user/" + id, Object.class));
    }
}
