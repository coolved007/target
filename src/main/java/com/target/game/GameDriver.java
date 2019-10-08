package com.target.game;

public class GameDriver {

    public static void main(String[] args) {

        Game game = new Game(5);
        game.play(5);
        System.out.println("******WINNER******");
        System.out.println(game.getWinners());
    }
}
