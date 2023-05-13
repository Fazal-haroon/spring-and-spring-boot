package com.example.demo.gaming;

public class GameRunner {
//    MarioGame marioGame;
//    SuperContraGame superContraGame;

    GamingConsole gaming;

//    public GameRunner(MarioGame marioGame) {
//        this.marioGame = marioGame;
//    }

//    public GameRunner(SuperContraGame superContraGame) {
//        this.superContraGame = superContraGame;
//    }


    public GameRunner(GamingConsole gaming) {
        this.gaming = gaming;
    }

    public void run() {
//        System.out.println("Running game: " + marioGame);
        System.out.println("Running game: " + gaming);
//        marioGame.up();
//        marioGame.down();
//        marioGame.left();
//        marioGame.right();
        gaming.up();
        gaming.down();
        gaming.left();
        gaming.right();
    }
}
