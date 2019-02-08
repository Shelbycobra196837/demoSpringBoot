package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.entyti.Person;

import com.example.demoSpringBoot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class PersonResource {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person")
    public List<Person> AllPerson(){
        return personRepository.findAll();
    }

    @GetMapping("/person/{id}")
    public Person retrievePerson(@PathVariable Long id){
        Optional<Person> person = personRepository.findById(id);
        return person.get();
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
    }

    @PostMapping("/person")
    public void createPerson (@RequestBody Person person){
        personRepository.save(person);
    }

    @PutMapping("/person/{id}")
    public void updatePerson (@RequestBody Person person , @PathVariable Long id){
        person.setId(id);
        personRepository.save(person);

    }
}
