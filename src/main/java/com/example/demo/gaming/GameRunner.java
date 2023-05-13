package com.example.demo.gaming;

public class GameRunner {
//    MarioGame marioGame;
    SuperContraGame superContraGame;

//    public GameRunner(MarioGame marioGame) {
//        this.marioGame = marioGame;
//    }

    public GameRunner(SuperContraGame superContraGame) {
        this.superContraGame = superContraGame;
    }

    public void run() {
//        System.out.println("Running game: " + marioGame);
        System.out.println("Running game: " + superContraGame);
//        marioGame.up();
//        marioGame.down();
//        marioGame.left();
//        marioGame.right();
        superContraGame.up();
        superContraGame.down();
        superContraGame.left();
        superContraGame.right();
    }
}
