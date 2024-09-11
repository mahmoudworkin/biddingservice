package com.example.repository;

import com.example.domain.Bid;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long> {
}
