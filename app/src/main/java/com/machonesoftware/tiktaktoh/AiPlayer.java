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

    public void makeMove(){
        makeMove(findBestMove());
    }

    private int findBestMove(){
        int depth;
        double chanceOfMakingWrongMove;
        switch(_difficulty){
            case Easy:
                depth = 3;
                chanceOfMakingWrongMove = 0.15;
                break;
            case Medium:
                depth = 7;
                chanceOfMakingWrongMove = 0.1;
                break;
            case Hard:
                depth = 9;
                chanceOfMakingWrongMove = 0.05;
                break;
            case Impossible:
                depth = Integer.MAX_VALUE;
                chanceOfMakingWrongMove = 0;
                break;
        }

        // TODO minimax

        return -1;
    }

    private int getMax(){
        return 1;
    }

    private int getMin(){
        return -1;
    }
}
