package com.example.demo;

import com.example.demo.gaming.GameRunner;
import com.example.demo.gaming.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var gaming = new MarioGame();
        var gaming = new PacmanGame(); //Object creation
//        var gaming = new SuperContraGame();
//        var gameRunner = new GameRunner(marioGame);
        var gameRunner = new GameRunner(gaming); //Object Creation + wiring of dependencies
        //gaming is a Dependency of GameRunner
        gameRunner.run();
    }
}
