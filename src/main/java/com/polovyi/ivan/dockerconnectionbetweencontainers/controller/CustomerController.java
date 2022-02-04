package com.polovyi.ivan.dockerconnectionbetweencontainers.controller;

import com.polovyi.ivan.dockerconnectionbetweencontainers.dto.CustomerResponse;
import com.polovyi.ivan.dockerconnectionbetweencontainers.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public record CustomerController(CustomerService customerService) {

    @GetMapping(path = "/v1/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerResponse> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
