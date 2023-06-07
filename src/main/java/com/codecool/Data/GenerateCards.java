package com.codecool.Data;

import com.codecool.model.Card;
import com.codecool.model.Suit;
import com.codecool.model.Symbol;

import java.util.ArrayList;

public class GenerateCards {
    private static ArrayList<Card> deck = new ArrayList<Card>();
    public GenerateCards() {
        for (Suit suit : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                Card card = new Card(Symbol.NUMBER(i), suit);
                deck.add(card);

            }
            Symbol[] courtSymbols = {Symbol.JACK, Symbol.QUEEN, Symbol.KING, Symbol.ACE};

            for (Symbol courtSymbol : courtSymbols) {
                //Same steps as above
                Card card = new Card(courtSymbol, suit);
                deck.add(card);
            }
        }
    }
    public static ArrayList<Card> getDeck() {
        return deck;
    }
}
