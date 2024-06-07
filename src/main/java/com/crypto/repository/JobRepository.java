package com.crypto.repository;

import com.crypto.persistance.entity.Jobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JobRepository extends PagingAndSortingRepository<Jobs,Long> , CrudRepository<Jobs, Long> {
}
