package com.example.hw.services;

import com.example.hw.entity.Car;

import java.util.List;

public interface CarService {
    Car addCar(Car car);

    List<Car> getAllCars();
}
