package com.example.trainapp;

import java.util.Collection;
import java.util.List;

public interface PersonService {

    List<Person> getAllPeople();
    void createPerson(Person p);
    void updatePerson(Person p);
    void deletePerson(Person p);

}
