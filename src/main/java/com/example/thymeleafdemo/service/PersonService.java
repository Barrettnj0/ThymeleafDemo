package com.example.thymeleafdemo.service;

import com.example.thymeleafdemo.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Arrays;

@Service
public class PersonService {

    public String getPeopleExample(Model model) {
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person(1,"John", 20),
                new Person(2,"Sarah", 22),
                new Person(3,"Simon", 23)
        ));
        return "people";
    }
}
