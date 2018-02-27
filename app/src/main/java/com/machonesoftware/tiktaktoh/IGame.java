package com.machonesoftware.tiktaktoh;

/**
 * Created by Jordan on 2/26/2018.
 */

public interface IGame{
    int GridSize = 3;
    void placeLetter(Letter letter, int i);
    Letter getLetterAt(int i);
    void clearGrid();
    boolean checkWin(Letter l);
}