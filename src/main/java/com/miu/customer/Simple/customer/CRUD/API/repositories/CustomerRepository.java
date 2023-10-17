package com.miu.customer.Simple.customer.CRUD.API.repositories;

import com.miu.customer.Simple.customer.CRUD.API.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
