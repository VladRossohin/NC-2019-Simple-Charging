package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.BillingAccount;
import com.netcracker.edu.backend.entity.BillingAccounts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BillingAccountRepository extends JpaRepository<BillingAccounts, Long>, PagingAndSortingRepository<BillingAccounts, Long> {

    @Override
    Page<BillingAccounts> findAll(Pageable pageable);
    Page<BillingAccounts> findAllByUsersByUserIdId(long userId, Pageable pageable);
    Page<BillingAccounts> findAllByUsersByUserIdLogin(String login, Pageable pageable);
    BillingAccounts findByNumber(String number);
    BillingAccounts findById(long id);


    List<BillingAccounts> findAllByUsersByUserIdId(long userId);

    void deleteByUsersByUserIdLogin(String login);
}
