package com.miu.customer.Simple.customer.CRUD.API.controllers;

import com.miu.customer.Simple.customer.CRUD.API.domain.Passenger;
import com.miu.customer.Simple.customer.CRUD.API.domain.Seat;
import com.miu.customer.Simple.customer.CRUD.API.repositories.PassengerRepository;
import com.miu.customer.Simple.customer.CRUD.API.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @Autowired
    PassengerRepository passengerRepository;

    @GetMapping("/test")
    public String returnString() {
        return "Hello";
    }

    @GetMapping
    public ResponseEntity<List<Seat>> listSeats() {
        return ResponseEntity.ok(passengerService.listSeat());
    }

    @PostMapping
    public ResponseEntity<Passenger> assignSeat(@RequestBody Passenger passenger) {
        boolean assignSeat = passengerService.assignSeat(passenger);
        if(assignSeat) {
            return new ResponseEntity<>(passenger, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
    @PostMapping("/{seatNumber}")
    public ResponseEntity<String> cancelSeat(@PathVariable String seatNumber) {
         boolean cancel = passengerService.cancelSeat(seatNumber);
         if(cancel) {
             return new ResponseEntity<>("Seat cacealed", HttpStatus.CREATED);
         }
         return ResponseEntity.status(200).body(seatNumber);
    }



}
