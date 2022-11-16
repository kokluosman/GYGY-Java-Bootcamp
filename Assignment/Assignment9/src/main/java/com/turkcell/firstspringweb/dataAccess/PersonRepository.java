package com.turkcell.firstspringweb.dataAccess;

import com.turkcell.firstspringweb.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

    //Burada CRUD işlemleri için metodlar yazdım.
    //Normalda JPA Kullanırken kendimiz SQL Sorgusu yazmıyoruz direk metodlar üzerinden sorguları
    //çalıştırıyoruz fakat burada JDBC kullanarak kendi sorgularımızı yazdım.

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ArrayList<Person> getAll(){
        String query ="select * from person";
        List<Person> query1 = namedParameterJdbcTemplate.query(query, new PersonRowMapper());
        return (ArrayList<Person>) query1;
    }

}
