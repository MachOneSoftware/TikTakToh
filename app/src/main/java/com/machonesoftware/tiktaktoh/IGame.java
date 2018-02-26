package com.machonesoftware.tiktaktoh;

/**
 * Created by Jordan on 2/26/2018.
 */

public interface IGame{
    int GridSize = 3;
    boolean makeMove(Letter letter, int x, int y);
    Letter getLetterAt(int x, int y);
    void clearGrid();
}