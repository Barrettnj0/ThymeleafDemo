package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Person;
import com.example.thymeleafdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("example")
    String getPeopleExample(Model model) {
        return personService.getPeopleExample(model);
    }
}
