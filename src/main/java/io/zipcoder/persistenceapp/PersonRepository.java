package io.zipcoder.persistenceapp;

import org.springframework.data.repository.CrudRepository;

public class PersonRepository implements CrudRepository<Person, Integer> {
    @Override
    public <S extends Person> S save(S s) {
        return null;
    }

    @Override
    public <S extends Person> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Person findOne(Integer integer) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Person> findAll() {
        return null;
    }

    @Override
    public Iterable<Person> findAll(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void delete(Iterable<? extends Person> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
