package com.machonesoftware.tiktaktoh;

/**
 * Created by Jordan on 2/26/2018.
 */

public interface IPlayer {
    Game getGame();
    String getName();
    Letter getLetter();
    void startGame(Game game);
    boolean checkWin();
    void makeMove(int i);
}
