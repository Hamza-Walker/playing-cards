package com.codecool.model;

import java.util.Objects;

public class Card {
    private Symbol symbol;
    private Suit suit;
    private final String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return symbol == card.symbol && suit == card.suit && Objects.equals(title, card.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, suit, title);
    }

    @Override
    public String toString() {
        return title;
    }

    public Card (Symbol symbol, Suit suit) {
        this.symbol = symbol;
        this.suit = suit;
        this.title = createTitle();

    }
    public Symbol getSymbol() {
        return symbol;
    }

    public Suit getSuit() {
        return suit;
    }
    public String getTitle() {
        return title;
    }
    private String createTitle(){
        return this.symbol + " of " + this.suit;
    }

}
