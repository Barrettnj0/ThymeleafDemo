package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Rps;
import com.example.thymeleafdemo.model.RpsGame;
import com.example.thymeleafdemo.service.RpsService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RpsService rpsService;

    @GetMapping("/rps")
    public String rpsInputs(Model model) {

        Rps rps = new Rps();
        model.addAttribute("rps", rps);

        List<String> rpsList = Arrays.asList("Rock", "Paper", "Scissors");
        model.addAttribute("rpsList", rpsList);

        model.addAttribute("winCount", rpsService.getWins());
        model.addAttribute("lossCount", rpsService.getLosses());
        model.addAttribute("drawCount", rpsService.getDraws());
        model.addAttribute("winRatio", rpsService.getWinRatio());
        return "rps";
    }

    @GetMapping("/rps/result")
    public String rpsOutput(Model model, @ModelAttribute("rps") Rps rps) {

        String result = null;
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
            result = "DRAW";
        }
        else if((rps.getHand().equals("Rock") && oRps.getHand().equals("Scissors"))
                || (rps.getHand().equals("Paper") && oRps.getHand().equals("Rock"))
                || (rps.getHand().equals("Scissors") && oRps.getHand().equals("Paper"))) {
            result = "YOU WIN";
        }
        else {
            result = "YOU LOSE";
        }
        rpsService.sendGameInfo(new RpsGame(result, rps.getHand(), oRps.getHand()));
        model.addAttribute("result", result);
        return "rps_result";
    }
}
