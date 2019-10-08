package com.target.game;

import java.util.ArrayList;
import java.util.List;
 
public class Deck extends Card {
 
	private final static List<Card> deckOfCards = new ArrayList<Card>();
	private static int currentCard;
	private final static int MAX_CARDS = 52;

    static {
		for (final Suit suit : Suit.values()) {
		    for (final Rank rank : Rank.values()) {
		    	Card tempCard = new Card(rank, suit);
		    	Deck.deckOfCards.add(tempCard);
		    }
		}
    }

    protected Deck(final Rank rank, final Suit suit) {
    	super(rank, suit);
    }
 
    public static void shuffle() {
		for (int next = 0; next < MAX_CARDS-1; next++){
			int r = getRandomIndex(next, MAX_CARDS-1);
			Card temp = deckOfCards.get(next);
			deckOfCards.set(next,deckOfCards.get(r));
			deckOfCards.set(r, temp);
		}
		currentCard = 0;
	}

	private static int getRandomIndex(int low, int high)
	{
		return (int)((high+1-low)*Math.random()+low);
	}

	public static Card deal() {
		if (currentCard < MAX_CARDS) {
			return ( deckOfCards.get(currentCard++) );
		}
		else{
			System.out.println("No cards to deal");
			return null;
		}
	}

	public static List<Card> getDeckOfCards() {
		return deckOfCards;
	}
}