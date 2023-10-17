package com.miu.customer.Simple.customer.CRUD.API.controllers;

import com.miu.customer.Simple.customer.CRUD.API.domain.Customer;
import com.miu.customer.Simple.customer.CRUD.API.repositories.CustomerRepository;
import com.miu.customer.Simple.customer.CRUD.API.services.CustomerAdapter;
import com.miu.customer.Simple.customer.CRUD.API.services.CustomerDTO;
import com.miu.customer.Simple.customer.CRUD.API.services.ICustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {
  private  CustomerRepository customerRepository;

     CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public CustomerDTO getCustomer(@PathVariable Long id) {
         Customer customer = customerRepository.findById(id).get();
         CustomerDTO customerDTO = CustomerAdapter.getCustomerDTO(customer);
         return customerDTO;
    }


    @PostMapping
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
         Customer customer = CustomerAdapter.getCustomer(customerDTO);
         Customer customer1 = customerRepository.save(customer);
         return CustomerAdapter.getCustomerDTO(customer1);
    }







}
