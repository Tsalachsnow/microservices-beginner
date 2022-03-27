package com.tsalachsnow.customer.services.serviceImpl;

import com.tsalachsnow.customer.model.Customer;
import com.tsalachsnow.customer.payloads.CustomerRegistrationRequest;
import com.tsalachsnow.customer.services.CustomerService;
import org.springframework.stereotype.Service;

@Service
public record CustomerServiceImpl() implements CustomerService {
 public void registerCustomer(CustomerRegistrationRequest request){
     Customer customer = Customer.builder()
             .firstName(request.firstName())
             .lastName(request.lastName())
             .email(request.email())
             .build();
     //todo: check if email is valid
     //todo: check if email not taken
     //todo: store customer in DB
 }
}
