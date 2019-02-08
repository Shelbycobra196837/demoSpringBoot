package com.example.demoSpringBoot.repository;

import com.example.demoSpringBoot.entyti.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {
}
