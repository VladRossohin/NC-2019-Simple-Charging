package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Long> {

    Optional<Service> findByUserId(long userId);

    Service findById(long id);

    @Override
    Iterable<Service> findAll();
}
