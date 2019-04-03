package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BillingAccountsRepository extends CrudRepository<BillingAccounts, Long> {

    BillingAccounts findByUser(Users userId);

    @Override
    Iterable<BillingAccounts> findAll();
}
