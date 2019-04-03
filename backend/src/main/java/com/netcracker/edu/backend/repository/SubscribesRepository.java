package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Subscribes;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscribesRepository extends CrudRepository<Subscribes, Long> {

    Subscribes findByUserId(Users userId);

    @Override
    Iterable<Subscribes> findAll();
}
