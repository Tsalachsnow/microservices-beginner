package com.tsalachsnow.customer.controllers;

import com.tsalachsnow.customer.payloads.CustomerRegistrationRequest;
import com.tsalachsnow.customer.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService){
    @PostMapping
 public void createCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
     log.info("new customer registration {}", customerRegistrationRequest);
     customerService.registerCustomer(customerRegistrationRequest);
 }
}
