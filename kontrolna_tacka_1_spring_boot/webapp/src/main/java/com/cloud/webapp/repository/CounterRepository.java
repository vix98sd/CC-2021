package com.cloud.webapp.repository;

import com.cloud.webapp.model.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CounterRepository extends JpaRepository<Counter, Integer> {
    Optional<Counter> findByMethodAndEndpoint(String method, String endpoint);
}
