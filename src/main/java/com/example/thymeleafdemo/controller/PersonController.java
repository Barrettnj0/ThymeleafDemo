package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/example")
    String getPeopleExample(Model model) {
        return personService.getPeopleExample(model);
    }
}
