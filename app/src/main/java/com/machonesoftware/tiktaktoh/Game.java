package com.machonesoftware.tiktaktoh;

public class Game implements IGame {
    private Letter[][] grid;

    public Game(){
        // Initialize the grid to empty
        grid = new Letter[GridSize][GridSize];
        clearGrid();
    }

    // TODO consider automatically switching between x/o
    public boolean makeMove(Letter letter, int x, int y){
        if (letter == Letter.empty)
            throw new IllegalArgumentException("Letter must be X or O");

        if (grid[x][y] == Letter.empty)
            grid[x][y] = letter;
        return checkWin(letter, x, y);
    }

    public Letter getLetterAt(int x, int y){
        if (grid == null)
            throw new IllegalStateException("Grid is not initialized");

        return grid[x][y];
    }

    public void clearGrid(){
        if (grid == null)
            throw new IllegalStateException("Grid is not initialized");

        for (int i = 0; i < GridSize; i++){
            for (int j = 0; j < GridSize; j++){
                grid[i][j] = Letter.empty;
            }
        }
    }

    // TODO consider returning where the win was
    private boolean checkWin(Letter l, int x, int y){
        // Check for vertical line
        if (grid[x][0] == l && grid[x][1] == l && grid[x][2] == l)
            return true;

        // Check for horizontal line
        if (grid[0][y] == l && grid[1][y] == l && grid[2][y] == l)
            return true;

        // Check for diagonal lines
        if (!(x == 0 && y == 1) && !(x == 1 && y == 0) && !(x == 2 && y == 1) && !(x == 1 && y == 2)){
            if (grid[0][0] == l && grid[1][1] == l && grid[2][2] == l)
                return true;
            if (grid[2][0] == l && grid[1][1] == l && grid [0][2] == l)
                return true;
        }

        return false;
    }
}
