package com.example.demoSpringBoot.repository;

import com.example.demoSpringBoot.entyti.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Cars, Long> {
}
