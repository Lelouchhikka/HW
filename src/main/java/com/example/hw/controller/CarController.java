package com.example.hw.controller;

import com.example.hw.entity.Car;
import com.example.hw.services.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Slf4j
@Controller
public class CarController{

    public CarController(CarService service) {
        this.service = service;
    }

    @Autowired
    private CarService service;

    @GetMapping("/")
    public String index(Model model){
        List<Car> cars= service.getAllCars();
        model.addAttribute("cars",cars);
        return "index";
    }
    @PostMapping("/add")
    public String add(@RequestParam(name = "model") String model,
                      @RequestParam(name = "price") Integer price,
                      @RequestParam(name = "brand") String brand,
                      @RequestParam(name="engineVolume") Double engineVolume
    ){
        service.addCar(new Car( null,model,brand,engineVolume,price));


        return "redirect:/";
    }
}
