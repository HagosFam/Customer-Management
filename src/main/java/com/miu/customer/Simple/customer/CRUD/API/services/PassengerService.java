package com.miu.customer.Simple.customer.CRUD.API.services;

import com.miu.customer.Simple.customer.CRUD.API.domain.Passenger;
import com.miu.customer.Simple.customer.CRUD.API.domain.Seat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PassengerService implements IPassengerService {
    List<Seat> seatList;
    Map<Long, Passenger> seatMap;

    PassengerService() {
        seatMap = new HashMap<>();
        seatList = new ArrayList<>();
        initilaizeSeats();
    }
    public void initilaizeSeats() {
       seatList.add(new Seat("", "", true));
       seatList.add(new Seat("", "", false));
       seatList.add(new Seat("", "", true));
       seatList.add(new Seat("", "", false));
    }

    @Override
    public boolean assignSeat(Passenger passenger) {
        for(Seat seat: seatList) {
            if(!seat.isOccupied() ) {
                seat.setOccupied(true);
                passenger.setSeat(seat);
                seatMap.put(passenger.getPassengerId(), passenger);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cancelSeat(String seatNumber) {
        for(Seat seat: seatList) {
            if(seat.getSeatNumber().equals(seatNumber) && !seat.seatIsOccupied() ) {
                seat.setOccupied(false);
                seatMap.values().removeIf(passenger -> passenger.getSeat().getSeatNumber().equals(seatNumber));
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Seat> listSeat() {
        return seatList;
    }
}
