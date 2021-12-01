package com.cloud.webapp.controller;

import com.cloud.webapp.model.Person;
import com.cloud.webapp.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public Person createNewPerson(@RequestBody Person person){
        return personService.createNewPerson(person);
    }

    @GetMapping(path = "{personId}")
    public Person findPersonById(@PathVariable("personId") Long personId){
        return personService.findPersonById(personId);
    }

    @GetMapping
    public List<Person> findAllPersons(){
        return personService.findAllPersons();
    }
}
