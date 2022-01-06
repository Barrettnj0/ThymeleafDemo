package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("main")
    String getMain(Model model) {
        return mainService.getMain(model);
    }
}
