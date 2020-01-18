package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/people")
    public ResponseEntity<Iterable<Person>> getAllPeople() {
        return new ResponseEntity<>(personService.getAllPeople(), HttpStatus.OK);
    }

    @GetMapping("/people/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable int id) {
        return new ResponseEntity<>(personService.findPersonById(id), HttpStatus.OK);
    }

//    @PostMapping("/people")
//    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
//        return new ResponseEntity<>(personService.addPerson(person), HttpStatus.CREATED);
//    }

    @PostMapping("/people")
    public ResponseEntity createPerson(@RequestBody Person person) {
        return new ResponseEntity(personService.addPerson(person), HttpStatus.CREATED);
    }

    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
        if (person.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(personService.updatePerson(person), HttpStatus.OK);
        }
    }

//    @DeleteMapping("/people/{id}")
//    public ResponseEntity<Person> deletePerson(@RequestBody Person person) {
//        personService.deletePerson(person);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

//    @GetMapping("/people/ids")
//    public ResponseEntity<Iterable<Person>> getAllPeople(@RequestBody List<Integer> peopleIds) {
//        return new ResponseEntity<>(personService.getSeveralPeople(peopleIds), HttpStatus.OK);
//    }

}
