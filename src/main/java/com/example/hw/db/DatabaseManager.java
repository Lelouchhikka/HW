package com.example.hw.db;

import com.example.hw.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static List<Car> cars=new ArrayList();
    private static Long index=1L;
    static{
        cars.add(new Car(1L,"qweqw","JOTARO",2333.1,2000));
    }
    public static void addCar(Car car){
        car.setId(index);
        cars.add(car);
        index++;
    }
    public static List<Car>getCars(){
        return cars;
    }
}
