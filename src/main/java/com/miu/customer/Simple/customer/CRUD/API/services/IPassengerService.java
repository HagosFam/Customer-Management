package com.miu.customer.Simple.customer.CRUD.API.services;

import com.miu.customer.Simple.customer.CRUD.API.domain.Passenger;
import com.miu.customer.Simple.customer.CRUD.API.domain.Seat;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPassengerService {

    boolean assignSeat(Passenger passenger);

    boolean cancelSeat(String seatNumber);

    List<Seat> listSeat();

}
