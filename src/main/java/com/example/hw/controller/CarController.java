package com.example.hw.controller;

import com.example.hw.db.DatabaseManager;
import com.example.hw.entity.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Slf4j
@Controller
public class CarController{
    @GetMapping(value = "/")
    public String Index(Model model){
        List<Car> cars= DatabaseManager.getCars();
        model.addAttribute("cars",cars);
        return "index";
    }

    @GetMapping(value = "/about")
    public String About(){
        return "about";
    }
    @PostMapping(value = "/add")
    public String add(@RequestParam(name = "model") String model,
                          @RequestParam(name = "price") Integer price,
                          @RequestParam(name = "brand") String brand,
                          @RequestParam(name="engineVolume") Double engineVolume
    ){
        Car car= new Car(null,model,brand,engineVolume,price);
        DatabaseManager.addCar(car);
        DatabaseManager.addCar(car);
        return "redirect:/";
    }
}
