package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Haris Khan on 5/14/2017.
 */
@RestController
@RequestMapping("/person")
public class PersonCrudController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person) {
        System.out.println(person.getAge());
        System.out.println(person.getName());
        personRepository.save(person);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updatePerson(@RequestBody Person person) {
        Person person1 = personRepository.findOne(person.getId());
        person1.setAge(person.getAge());
        person1.setName(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getName());
        personRepository.save(person1);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> getPersons() {
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }
}
