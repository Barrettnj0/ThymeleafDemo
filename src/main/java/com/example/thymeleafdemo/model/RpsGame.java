package com.example.thymeleafdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAME")
public class RpsGame {

    //
    // Data members
    //

    @Id
    @GeneratedValue
    private int id;
    private String result;
    private String playerHand;
    private String opponentHand;

    //
    // Constructors
    //

    public RpsGame() {}

    public RpsGame(String result, String playerHand, String opponentHand) {
        this.result = result;
        this.playerHand = playerHand;
        this.opponentHand = opponentHand;
    }

    //
    // Getters
    //


    public int getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public String getPlayerHand() {
        return playerHand;
    }

    public String getOpponentHand() {
        return opponentHand;
    }

    //
    // Setters
    //


    public void setId(int id) {
        this.id = id;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setPlayerHand(String playerHand) {
        this.playerHand = playerHand;
    }

    public void setOpponentHand(String opponentHand) {
        this.opponentHand = opponentHand;
    }
}
