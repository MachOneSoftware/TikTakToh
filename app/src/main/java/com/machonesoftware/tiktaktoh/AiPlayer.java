package com.machonesoftware.tiktaktoh;

/**
 * Created by Jordan on 2/26/2018.
 */

public class AiPlayer extends Player implements IAiPlayer {
    private Difficulty _difficulty;

    public AiPlayer(Letter letter, Difficulty difficulty){
        super("Toby", letter);
        _difficulty = difficulty;
    }

    public Difficulty getDifficulty(){
        return _difficulty;
    }

    public int[] findBestMove(){
        return new int[]{0,0};
    }
}
