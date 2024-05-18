package com.crypto.repository;

import com.crypto.persistance.entity.Jobs;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Jobs,Long> {
}
