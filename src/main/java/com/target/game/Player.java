package com.target.game;

public class Player {

    private final String name;
    private Card card;

    public Player(String name) {
        this.name = name;
    }

    public void assignCard(Card card){
        this.card = card;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", card=" + card +
                '}';
    }
}
