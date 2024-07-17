package com.miu.customer.Simple.customer.CRUD.API.repositories;

import com.miu.customer.Simple.customer.CRUD.API.domain.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassengerRepository extends MongoRepository<Passenger, String> {

}
