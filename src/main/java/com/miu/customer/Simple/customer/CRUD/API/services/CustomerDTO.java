package com.miu.customer.Simple.customer.CRUD.API.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Long id;
    private String name;
    private String gender;
    private double income;
    private double tax;
}
