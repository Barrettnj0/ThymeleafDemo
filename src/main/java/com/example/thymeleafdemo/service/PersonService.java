package com.example.thymeleafdemo.service;

import com.example.thymeleafdemo.model.Person;
import com.example.thymeleafdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Arrays;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void getPeopleExample(Model model) {
        model.addAttribute("something", "List of People:");
        model.addAttribute("people", personRepository.findAll());
    }
}
