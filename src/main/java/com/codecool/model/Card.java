package com.codecool.model;

public class Card {
    private Symbol symbol;
    private Suit suit;

    public Card (Symbol symbol, Suit suit) {
        this.symbol = symbol;
        this.suit = suit;
    }
    public Symbol getSymbol() {
        return symbol;
    }
    public void setSymbol (Symbol symbol){
        this.symbol = symbol;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
