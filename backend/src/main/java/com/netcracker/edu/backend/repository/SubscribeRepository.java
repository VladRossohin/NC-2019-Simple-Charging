package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Subscribe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscribeRepository extends CrudRepository<Subscribe, Long> {

    @Override
    Iterable<Subscribe> findAll();

    Optional<Subscribe> findByUserId(long userId);

    Optional<Subscribe> findById(long id);

}
