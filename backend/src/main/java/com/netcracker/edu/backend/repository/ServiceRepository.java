package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Services;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Services, Long>, PagingAndSortingRepository<Services, Long> {
/*
    @Override
    Iterable<Services> findAll();*/

    @Override
    Page<Services> findAll(Pageable pageable);

  /*  @Override
    Iterable<Services> findAll(Sort sort);
*/
    List<Services> findByUsersByUserId(long id);

    List<Services> findAllByUsersByUserIdId(long id);
}
