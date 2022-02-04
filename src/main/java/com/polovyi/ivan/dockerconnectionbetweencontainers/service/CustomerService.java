package com.polovyi.ivan.dockerconnectionbetweencontainers.service;


import com.polovyi.ivan.dockerconnectionbetweencontainers.dto.CustomerResponse;
import com.polovyi.ivan.dockerconnectionbetweencontainers.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public record CustomerService(CustomerRepository customerRepository) {

    public List<CustomerResponse> getAllCustomers() {
        log.info("Getting all customers...");
        return customerRepository.findAll().stream().map(CustomerResponse::valueOf).collect(Collectors.toList());
    }

}
