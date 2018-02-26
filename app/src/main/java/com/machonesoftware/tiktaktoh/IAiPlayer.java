package com.machonesoftware.tiktaktoh;

/**
 * Created by Jordan on 2/26/2018.
 */

public interface IAiPlayer extends IPlayer {
    Difficulty getDifficulty();
    int[] findBestMove();
}
