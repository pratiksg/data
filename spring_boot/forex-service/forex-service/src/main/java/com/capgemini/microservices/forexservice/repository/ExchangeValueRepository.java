package com.capgemini.microservices.forexservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.microservices.forexservice.entity.ExchangeValue;

public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}
