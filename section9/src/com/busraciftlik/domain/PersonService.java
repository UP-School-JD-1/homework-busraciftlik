package com.busraciftlik.domain;

import com.busraciftlik.ex.PersonNotFoundException;
import com.busraciftlik.model.Address;
import com.busraciftlik.model.Person;

import java.util.TreeSet;

public class PersonService {

    private TreeSet<Person> people;

    public PersonService(TreeSet<Person> people) {
        this.people = people;
    }

    public Person findByAddress(Address address) {
        for(Person person : people) {
            if(person.getAddress().equals(address)) {
                return person;
            }
        }
        throw new PersonNotFoundException();
    }

    public Person findByFirstName(String firstName){
        for(Person person : people) {
            if(person.getFirstName().equals(firstName)) {
                return person;
            }
        }
        throw new PersonNotFoundException();
    }

    public Person findByLastName(String lastName){
        for(Person person : people) {
            if(person.getLastName().equals(lastName)) {
                return person;
            }
        }
        throw new PersonNotFoundException();
    }



}
