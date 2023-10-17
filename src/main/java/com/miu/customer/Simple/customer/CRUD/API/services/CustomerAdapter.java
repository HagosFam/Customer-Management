package com.miu.customer.Simple.customer.CRUD.API.services;

import com.miu.customer.Simple.customer.CRUD.API.domain.Customer;

public class CustomerAdapter {

    public static Customer getCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setName(customerDTO.getName());
        customer.setTax(customerDTO.getTax());
        customer.setIncome(customerDTO.getIncome());
        return customer;
    }

    public static CustomerDTO getCustomerDTO(Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
        customerDTO.setTax(customer.getTax());
        customerDTO.setIncome(customer.getIncome());
        return customerDTO;
    }




}
