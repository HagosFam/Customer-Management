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
public class Seat {
    @Id
    private String seatNumber;
    private String seatClass;
    private boolean isOccupied;

    public boolean seatIsOccupied() {
        return isOccupied;
    }


}
