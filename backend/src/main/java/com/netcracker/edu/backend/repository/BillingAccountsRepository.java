package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.BillingAccounts;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BillingAccountsRepository extends CrudRepository<BillingAccounts, Long> {

    Optional<BillingAccounts> findByUserId(long userId);

    BillingAccounts findById(long id);

    @Override
    Iterable<BillingAccounts> findAll();
}
