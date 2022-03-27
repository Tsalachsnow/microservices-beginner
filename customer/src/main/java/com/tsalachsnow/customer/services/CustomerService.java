package com.tsalachsnow.customer.services;

import com.tsalachsnow.customer.payloads.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    void registerCustomer(CustomerRegistrationRequest request);
}
