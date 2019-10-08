package com.target.game;

import org.junit.Test;

public class CardTest {

    @Test
    public void testCardValue(){
        Card card1 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
        Card card2 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        assert card1.cardValue() < card2.cardValue();
    }

}