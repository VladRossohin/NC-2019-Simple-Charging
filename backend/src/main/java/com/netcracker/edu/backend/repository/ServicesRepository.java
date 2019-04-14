package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Services;
import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServicesRepository extends CrudRepository<Services, Long> {

    Optional<Services> findByUserId(long userId);

    Optional<Services> findById(long id);

    @Override
    Iterable<Services> findAll();
}
