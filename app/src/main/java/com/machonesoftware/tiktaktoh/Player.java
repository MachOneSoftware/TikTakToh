package com.machonesoftware.tiktaktoh;

/**
 * Created by Jordan on 2/26/2018.
 */

public class Player implements IPlayer {
    private Game _game;
    private String _name;
    private Letter _letter;

    public Player(String name, Letter letter){
        if (name.isEmpty())
            throw new IllegalArgumentException("name");
        if (letter.equals(Letter.empty))
            throw new IllegalArgumentException("letter");

        _name = name;
        _letter = letter;
    }

    public void startGame(Game game){
        _game = game;
    }

    public String getName(){
        return _name;
    }

    public Letter getLetter(){
        return _letter;
    }

    public Game getGame(){
        return _game;
    }
}
