package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.StreamSupport;

@Service
public class PersonService {

    @Autowired
    JdbcTemplate jdbcTemplate;;

    public Person addPerson(Person person) {
        int id = this.jdbcTemplate.update(
                "insert into PERSON (first_name,last_name,mobile,birthday,home_id)" +
                        "values ('" + person.getFirst_name() + "','" +
                        person.getLast_name() + "','" + person.getMobile() + "','" +
                        person.getBirthday() + "','" + person.getHome_id() + "');");

        return findPersonById(id);
    }


    public Person findPersonById(int id) {
        String sql = "SELECT * FROM Person WHERE ID = ?";
        return (Person) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(Person.class));

    }

//    public Person findPersonById(int id) {
//        return null;
//    }

    public Person updatePerson(Person person) {
        this.jdbcTemplate.execute(
                "UPDATE PERSON " +
                        "SET first_name ='" + person.getFirst_name() +
                        "', last_name ='"+ person.getLast_name() +
                        "', mobile ='" + person.getMobile() +
                        "', birthday ='"+ person.getBirthday() +
                        "', home_id ="+ person.getHome_id()+
                        " WHERE id="+person.getId()+";");
        return findPersonById(Math.toIntExact(person.getId()));
    }

    public Iterable<Person> getAllPeople() {
       return null;
    }

    public Iterable<Person> getSeveralPeople(Iterable<Integer> peopleIds) {
//        Iterable<Integer> peopleIds = StreamSupport.stream(people.spliterator(), false).mapToInt(x -> Math.toIntExact(x.getId()))::iterator;
        return null;
    }

    public void deletePerson(Person person) {

    }
}
