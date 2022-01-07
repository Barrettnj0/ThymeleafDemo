package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Person;
import com.example.thymeleafdemo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private HomeService mainService;

    @GetMapping("/home")
    public String showPersonForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "home";
    }

    @PostMapping("/home")
    public String submitPerson(@ModelAttribute("person") Person person) {
        System.out.println(person);
        mainService.postPerson(person);
        return "home_register_success";
    }
}
