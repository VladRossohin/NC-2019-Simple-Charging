package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>, PagingAndSortingRepository<Users, Long> {

    Users findByLogin(String login);

/*
    Users findById(long id);
*/

    @Override
    Optional<Users> findById(Long id);

    @Override
    Page<Users> findAll(Pageable pageable);

    @Override
    List<Users> findAll(Sort sort);

    @Override
    List<Users> findAll();

    void deleteByLogin(String login);
}
