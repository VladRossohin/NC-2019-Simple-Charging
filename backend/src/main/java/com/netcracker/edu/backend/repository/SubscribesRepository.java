package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Subscribes;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscribesRepository extends CrudRepository<Subscribes, Long> {

    @Override
    Iterable<Subscribes> findAll();

    Optional<Subscribes> findByUserId(Users user);

    @Override
    Optional<Subscribes> findById(Long id);

}
