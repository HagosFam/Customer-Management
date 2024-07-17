package com.miu.customer.Simple.customer.CRUD.API.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    private long passengerId;
    private String name;
    private Seat seat;

}
