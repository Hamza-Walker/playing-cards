package com.codecool.model;

import com.codecool.model.Card;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Deck {
    private static final Random RANDOM = new Random();

    private final ArrayList<Card> cards;
    private final ArrayList<Card> drawn;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        this.drawn = new ArrayList<>();
    }

    public int getCardCount() {
        return cards.size();
    }

    public Optional<Card> drawOne() {
        if (cards.isEmpty()) {
            return Optional.empty();
        }
        Card card = cards.get(RANDOM.nextInt(0, cards.size()));
        handleDraw(card);
        return Optional.of(card);
    }

    private void handleDraw(Card card) {
        cards.remove(card);
        drawn.add(card);
    }

    public void reset() {
        ArrayList<Card> current = new ArrayList<>(cards);
        cards.clear();
        cards.addAll(current);
        cards.addAll(drawn);
    }
}