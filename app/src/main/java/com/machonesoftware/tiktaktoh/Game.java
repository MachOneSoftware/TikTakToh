package com.machonesoftware.tiktaktoh;

import java.util.Arrays;

public class Game implements IGame {
    private Letter[] grid;

    public Game(){
        // Initialize the grid to empty
        grid = new Letter[GridSize*GridSize];
        clearGrid();
    }

    public void placeLetter(Letter letter, int i){
        if (letter == Letter.empty)
            throw new IllegalArgumentException("letter");
        if (i < 0 || i > 8)
            throw new IllegalArgumentException("i");

        if (grid[i] == Letter.empty)
            grid[i] = letter;
    }

    public Letter getLetterAt(int i){
        if (grid == null)
            throw new IllegalStateException("Grid is not initialized");
        if (i < 0 || i > 8)
            throw new IllegalArgumentException("i");

        return grid[i];
    }

    public void clearGrid(){
        if (grid == null)
            throw new IllegalStateException("Grid is not initialized");

        for (int i = 0; i < GridSize * GridSize; i++) {
            grid[i] = Letter.empty;
        }
    }

    // TODO consider returning where the win was
    public boolean checkWin(Letter letter){
        if (grid == null)
            throw new IllegalStateException("Grid is not initialized");
        if (letter.equals(Letter.empty))
            throw new IllegalArgumentException("letter");

        // Vertical
        for (int i = 0; i < GridSize; i++){
            if (grid[i]==letter && grid[i+3]==letter && grid[i+6]==letter) return true;
        }

        // Horizontal
        for (int i = 0; i < GridSize * GridSize; i+=3){
            if (grid[i]==letter && grid[i+1]==letter && grid[i+2]==letter) return true;
        }

        // Diagonal
        return (grid[0] == letter && grid[4] == letter && grid[8] == letter) ||
                (grid[2] == letter && grid[4] == letter && grid[6] == letter);
    }
}
