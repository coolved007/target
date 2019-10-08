package com.target.game;

public class GameDriver {

    public static void main(String[] args) {

        Game game = new Game(5);
        game.play(5);
        System.out.println("******WINNER******");
        for(Player winner : game.getWinners())
            System.out.println(winner.getName());
    }
}
