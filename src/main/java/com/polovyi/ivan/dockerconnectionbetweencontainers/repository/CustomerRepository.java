package com.polovyi.ivan.dockerconnectionbetweencontainers.repository;

import com.polovyi.ivan.dockerconnectionbetweencontainers.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

}
