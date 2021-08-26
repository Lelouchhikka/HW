package com.example.hw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Car {
    private Long Id;
    private String model;
    private String brand;
    private Double engineVolume;
    private Integer price;
}
