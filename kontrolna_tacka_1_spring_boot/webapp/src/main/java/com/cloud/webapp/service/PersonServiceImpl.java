package com.cloud.webapp.service;

import com.cloud.webapp.model.Person;
import com.cloud.webapp.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final CounterService counterService;

    @Override
    public Person createNewPerson(Person person) {
        counterService.updateCounterForEndpoint("POST", "persons");
        return personRepository.save(person);
    }

    @Override
    public Person findPersonById(Long personId) {
        counterService.updateCounterForEndpoint("GET", "persons");
        return personRepository.findById(personId).orElseThrow(() ->
                new IllegalStateException(String.format("person with id %s was not found", personId)));
    }

    @Override
    public List<Person> findAllPersons() {
        counterService.updateCounterForEndpoint("GET", "persons");
        return personRepository.findAll();
    }
}
