package com.target.game;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Player> players;
    private final int[] playerWinCount;
    private List<Player> winners;

    public Game(final int nPlayers) {
        this.players = new ArrayList<>();
        this.playerWinCount = new int[nPlayers];
        for(int i=0;i<nPlayers;i++){
            players.add(new Player("Player-" + (i+1)));
        }
    }

    public void play(int nRounds){
        int MAX_COUNT = 0;
        for(int i=0;i<nRounds;i++) {
            Deck.shuffle();
            Card highCard = new Card(Card.Rank.ACE, Card.Suit.SPADES);
            int roundWinner = 0;
            for (int nPlayer = 0; nPlayer < players.size(); nPlayer++) {
                Card dealtCard = Deck.deal();
                players.get(nPlayer).assignCard(dealtCard);
                if (dealtCard.rank().getRankValue() > highCard.rank().getRankValue() ||
                        (dealtCard.rank().getRankValue() == highCard.rank().getRankValue()
                                && highCard.cardValue() < dealtCard.cardValue())) {
                    highCard = dealtCard;
                    roundWinner = nPlayer;
                }
            }
            this.playerWinCount[roundWinner]++;
            if (MAX_COUNT < this.playerWinCount[roundWinner]) {
                MAX_COUNT = this.playerWinCount[roundWinner];
                winners = new ArrayList<>();
                winners.add(this.players.get(roundWinner));
            } else if(MAX_COUNT == this.playerWinCount[roundWinner]){
                winners.add(this.players.get(roundWinner));
            }
            System.out.print("Round " + (i + 1) + " status ===>");
            System.out.println(this.players.get(roundWinner).getName() + " wins");
        }
    }

    public List<Player> getWinners(){
        return winners;
    }

}
