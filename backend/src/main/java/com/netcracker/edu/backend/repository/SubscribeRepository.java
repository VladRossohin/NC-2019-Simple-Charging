package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Subscribe;
import com.netcracker.edu.backend.entity.Subscribes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribes, Long>, PagingAndSortingRepository<Subscribes, Long> {

    @Override
    Page<Subscribes> findAll(Pageable pageable);

    Page<Subscribes> findAllByUsersByUserIdId(long userId, Pageable pageable);

    Page<Subscribes> findAllByUsersByUserIdLogin(String login, Pageable pageable);

    Optional<Subscribes> findById(long id);

    void deleteById(long id);

    void deleteAllByBillingAccountsByBaIdNumber(String number);

    void deleteAllByUsersByUserIdLogin(String login);

}
