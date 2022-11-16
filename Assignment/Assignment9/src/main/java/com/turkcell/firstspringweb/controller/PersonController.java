package com.turkcell.firstspringweb.controller;

import com.turkcell.firstspringweb.dataAccess.PersonRepository;
import com.turkcell.firstspringweb.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PersonController {

    private final PersonRepository personRepository;

    //path = http://localhost:8080/firstspringweb/api/getAll
    @GetMapping(path = "getAll")
    public ArrayList<Person> getAll() {
        return personRepository.getAll();
    }
}
