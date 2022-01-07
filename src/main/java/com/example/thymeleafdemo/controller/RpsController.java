package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Rps;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class RpsController {

    @GetMapping("/rps")
    public String rpsInputs(Model model) {

        Rps rps = new Rps();
        model.addAttribute("rps", rps);

        List<String> rpsList = Arrays.asList("Rock", "Paper", "Scissors");
        model.addAttribute("rpsList", rpsList);

        return "rps";
    }

    @GetMapping("/rps/result")
    public String rpsOutput(Model model, @ModelAttribute("rps") Rps rps) {

        int randomNum = new Random().nextInt(3);
        Rps oRps = new Rps();

        switch (randomNum) {
            case 0:  oRps.setHand("Rock");
                break;
            case 1:  oRps.setHand("Paper");
                break;
            case 2:  oRps.setHand("Scissors");
                break;
        }
        model.addAttribute("oRps", oRps);


        if(rps.getHand().equals(oRps.getHand())) {
            model.addAttribute("result", "DRAW");
        }
        else if((rps.getHand().equals("Rock") && oRps.getHand().equals("Scissors"))
                || (rps.getHand().equals("Paper") && oRps.getHand().equals("Rock"))
                || (rps.getHand().equals("Scissors") && oRps.getHand().equals("Paper"))) {
            model.addAttribute("result", "YOU WIN");
        }
        else {
            model.addAttribute("result", "YOU LOSE");
        }
        String text = "Hello world!";
        model.addAttribute("text", text);
        return "rps_result";
    }
}
