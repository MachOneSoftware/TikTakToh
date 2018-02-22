package com.machonesoftware.tiktaktoh;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class GameUnitTests {
    @Test
    public void initGame() throws Exception {
        Game g = new Game();
        assertEquals(3, g.GridSize);
        checkGridIsEmpty(g);
    }
    
    @Test
    public void makeMoveX() throws Exception{
        makeMoveAndCheckAllBoxes(Letter.X);
    }

    @Test
    public void makeMoveO() throws Exception{
        makeMoveAndCheckAllBoxes(Letter.O);
    }
    
    @Test
    public void clearGrid() throws  Exception{
        Game g = new Game();
        g.makeMove(Letter.X, 1, 1);
        g.makeMove(Letter.O, 0,0);
        g.clearGrid();
        checkGridIsEmpty(g);
    }

    @Test
    public void xWin1() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 0, 0));
        assertFalse(g.makeMove(Letter.X, 0, 1));
        assertTrue(g.makeMove(Letter.X, 0, 2));
    }

    @Test
    public void xWin2() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 1, 0));
        assertFalse(g.makeMove(Letter.X, 1, 1));
        assertTrue(g.makeMove(Letter.X, 1, 2));
    }
    
    @Test
    public void xWin3() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 2, 0));
        assertFalse(g.makeMove(Letter.X, 2, 1));
        assertTrue(g.makeMove(Letter.X, 2, 2));
    }

    @Test
    public void xWin4() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 0, 0));
        assertFalse(g.makeMove(Letter.X, 1, 0));
        assertTrue(g.makeMove(Letter.X, 2, 0));
    }

    @Test
    public void xWin5() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 0, 1));
        assertFalse(g.makeMove(Letter.X, 1, 1));
        assertTrue(g.makeMove(Letter.X, 2, 1));
    }

    @Test
    public void xWin6() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 0, 2));
        assertFalse(g.makeMove(Letter.X, 1, 2));
        assertTrue(g.makeMove(Letter.X, 2, 2));
    }

    @Test
    public void xWin7() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 0, 0));
        assertFalse(g.makeMove(Letter.X, 1, 1));
        assertTrue(g.makeMove(Letter.X, 2, 2));
    }

    @Test
    public void xWin8() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.X, 2, 0));
        assertFalse(g.makeMove(Letter.X, 1, 1));
        assertTrue(g.makeMove(Letter.X, 0, 2));
    }

    @Test
    public void oWin1() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 0, 0));
        assertFalse(g.makeMove(Letter.O, 0, 1));
        assertTrue(g.makeMove(Letter.O, 0, 2));
    }

    @Test
    public void oWin2() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 1, 0));
        assertFalse(g.makeMove(Letter.O, 1, 1));
        assertTrue(g.makeMove(Letter.O, 1, 2));
    }

    @Test
    public void oWin3() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 2, 0));
        assertFalse(g.makeMove(Letter.O, 2, 1));
        assertTrue(g.makeMove(Letter.O, 2, 2));
    }

    @Test
    public void oWin4() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 0, 0));
        assertFalse(g.makeMove(Letter.O, 1, 0));
        assertTrue(g.makeMove(Letter.O, 2, 0));
    }

    @Test
    public void oWin5() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 0, 1));
        assertFalse(g.makeMove(Letter.O, 1, 1));
        assertTrue(g.makeMove(Letter.O, 2, 1));
    }

    @Test
    public void oWin6() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 0, 2));
        assertFalse(g.makeMove(Letter.O, 1, 2));
        assertTrue(g.makeMove(Letter.O, 2, 2));
    }

    @Test
    public void oWin7() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 0, 0));
        assertFalse(g.makeMove(Letter.O, 1, 1));
        assertTrue(g.makeMove(Letter.O, 2, 2));
    }

    @Test
    public void oWin8() throws  Exception{
        Game g = new Game();
        assertFalse(g.makeMove(Letter.O, 2, 0));
        assertFalse(g.makeMove(Letter.O, 1, 1));
        assertTrue(g.makeMove(Letter.O, 0, 2));
    }
    
    private void makeMoveAndCheckAllBoxes(Letter l){
        Game g = new Game();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                g.makeMove(l, i, j);
                assertEquals(l, g.getLetterAt(i,j));
            }
        }
    }
    
    private void checkGridIsEmpty(Game g){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                assertEquals(Letter.empty, g.getLetterAt(i,j));
            }
        }
    }
}