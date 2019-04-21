package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.BillingAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BillingAccountRepository extends CrudRepository<BillingAccount, Long> {

    Iterable<BillingAccount> findByUserId(long userId);

    BillingAccount findById(long id);

    @Override
    Iterable<BillingAccount> findAll();
}
