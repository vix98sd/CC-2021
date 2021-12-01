package com.cloud.webapp.service;

import com.cloud.webapp.model.Person;

import java.util.List;

public interface PersonService {
    Person createNewPerson(Person person);

    Person findPersonById(Long personId);

    List<Person> findAllPersons();
}
