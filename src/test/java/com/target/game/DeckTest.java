package com.target.game;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeckTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testDealValid(){
        Card dealtCard = Deck.deal();
        assertNotNull(dealtCard);
    }

    @Test
    public void testDealInValid(){
        for(int i=0;i<52;i++)
            Deck.deal();
        Card dealtCard = Deck.deal();
        assertNull(dealtCard);
    }
}