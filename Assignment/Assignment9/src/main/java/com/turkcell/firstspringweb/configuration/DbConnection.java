package com.turkcell.firstspringweb.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DbConnection {

    @Bean(name = "ds")
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Drive");
        ds.setUrl("jdbc:postgresql://localhost:5432/testdb");
        ds.setUsername("postgres");
        ds.setPassword("postgres");
        return ds;
    }

    //(parametreleri indeks değerleri ile atama)
    @Bean(name = "jdbcTemplate")
    @DependsOn(value = "datasource")
    public JdbcTemplate jdbcTemplate(
            @Autowired @Qualifier(value = "ds") DataSource ds) {
        return new JdbcTemplate(ds);
    }

    //(parametreleri isimlerle atama)
    @Bean(name = "namedParameterJdbcTemplate")
    @DependsOn(value = "datasource")
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(
            @Autowired @Qualifier(value = "ds") DataSource ds) {
        return new NamedParameterJdbcTemplate(ds);
    }


}
