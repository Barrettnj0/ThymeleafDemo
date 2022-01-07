package com.example.thymeleafdemo.service;

import com.example.thymeleafdemo.model.Person;
import com.example.thymeleafdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HomeService {

    @Autowired
    private PersonRepository personRepository;

    public void postPerson(Person person) {
        personRepository.save(person);
    }
}
