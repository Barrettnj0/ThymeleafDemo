package com.example.thymeleafdemo.service;

import com.example.thymeleafdemo.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Arrays;

@Service
public class MainService {

    public String getMain(Model model) {
        model.addAttribute("main");
        model.addAttribute("text", "Welcome to main");
        return "main";
    }
}
