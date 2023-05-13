package com.example.demo.gaming;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var gaming = new MarioGame();
        var gaming = new PacmanGame();
//        var gaming = new SuperContraGame();
//        var gameRunner = new GameRunner(marioGame);
        var gameRunner = new GameRunner(gaming);
        gameRunner.run();
    }
}
