package com.target.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game = null;

    @Before
    public void setUp() throws Exception {
        game = new Game(2);
    }

    @After
    public void tearDown() throws Exception {
        game = null;
    }

    @Test
    public void testPlayValidRounds(){
        game.play(2);
        assertNotNull(game.getWinners());
        assert game.getWinners().size() <= 2;

    }

    @Test
    public void testPlayZeroRounds(){
        game.play(0);
        assertNull(game.getWinners());
    }
}