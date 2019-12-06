package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    void addPerson(Person person) {

    }

    Person findById(int id) {
        return null;
    }

    List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        String sql = "SELECT * FROM person;";
        people = jdbcTemplate.query(sql, new PersonMapper());
        return people;
    }

    void deletePerson(int id) {
    }
}
