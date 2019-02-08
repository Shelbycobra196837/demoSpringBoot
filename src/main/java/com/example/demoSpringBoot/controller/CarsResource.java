package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.entyti.Cars;
import com.example.demoSpringBoot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class CarsResource {

    @Autowired
    private CarRepository carRepository;
    @GetMapping("/cars")
    public List<Cars> AllPerson(){
        return carRepository.findAll();
    }

    @GetMapping("/cars/{id}")
    public Cars retrievePerson(@PathVariable Long id){
        Optional<Cars> person = carRepository.findById(id);
        return person.get();
    }

    @DeleteMapping("/cars/{id}")
    public void deletePerson(@PathVariable Long id){
        carRepository.deleteById(id);
    }

    @PostMapping("/cars")
    public void createPerson (@RequestBody Cars cars){
        carRepository.save(cars);
    }

    @PutMapping("/cars/{id}")
    public void updateCars (@RequestBody Cars cars , @PathVariable Long id){
        cars.setId(id);
        carRepository.save(cars);

    }

}
