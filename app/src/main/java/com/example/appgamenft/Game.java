package com.example.appgamenft;

public class Game {
    private String imgGame;
    private String gameName;

    public Game(String imgGame, String gameName) {
        this.imgGame = imgGame;
        this.gameName = gameName;
    }

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public Game() {
    }

    public String getImgGame() {
        return imgGame;
    }

    public void setImgGame(String imgGame) {
        this.imgGame = imgGame;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
