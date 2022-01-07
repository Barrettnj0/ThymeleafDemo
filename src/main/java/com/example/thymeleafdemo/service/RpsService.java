package com.example.thymeleafdemo.service;

import com.example.thymeleafdemo.model.RpsGame;
import com.example.thymeleafdemo.repository.RpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class RpsService {

    @Autowired
    private RpsRepository rpsRepository;

    public void sendGameInfo(RpsGame rpsGame) {
        rpsRepository.save(rpsGame);
    }

    public int getWins() {
        return rpsRepository.findByResult("YOU WIN").size();
    }

    public int getLosses() {
        return rpsRepository.findByResult("YOU LOSE").size();
    }

    public int getDraws() {
        return rpsRepository.findByResult("DRAW").size();
    }

    public String getWinRatio() {

        DecimalFormat df = new DecimalFormat("#.###");

        float wins = rpsRepository.findByResult("YOU WIN").size();
        float losses = rpsRepository.findByResult("YOU LOSE").size();
        float draws = rpsRepository.findByResult("DRAW").size();
        return df.format(wins/(wins+losses+draws));
    }
}
