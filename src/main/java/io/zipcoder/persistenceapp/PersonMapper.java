package io.zipcoder.persistenceapp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

        Person person = new Person();
        person.setId(rs.getLong("id"));
        person.setFirst_name(rs.getString("first_name"));
        person.setLast_name(rs.getString("last_name"));
        person.setMobile(rs.getString("mobile"));
        person.setBirthday(rs.getString("birthday"));
        person.setHome_id(rs.getInt("home_id"));

        return person;

    }
}
