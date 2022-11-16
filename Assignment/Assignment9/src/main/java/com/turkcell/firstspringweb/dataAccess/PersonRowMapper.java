package com.turkcell.firstspringweb.dataAccess;

import com.turkcell.firstspringweb.model.Person;
import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {

    //JdbcTemplate tarafından bir ResultSet'in satırlarını satır bazında eşleştirmek için kullanılır .
    //nesneler üzerinden tablo adı ve sütunu ile objenizdeki sınıf ve değişkenlere mapping inin yapılmasını sağlar
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person p  = new Person();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        return p;
    }
}
