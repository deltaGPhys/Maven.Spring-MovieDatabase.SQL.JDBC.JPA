package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/people/")
    public RequestEntity<Iterable<Person>> getAllPeople() {
        personService.getAllPeople();
                return null;
        //return new RequestEntity<Person>(personService.getAllPeople());
    }
}
