package com.codecool;

import com.codecool.Data.GenerateCards;
import com.codecool.model.Card;
import com.codecool.model.Deck;


import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // Create a deck of cards
        GenerateCards generateCards = new GenerateCards();
        ArrayList<Card> deck = GenerateCards.getDeck();

        // Create a deck instance
        Deck gameDeck = new Deck(deck);

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to draw a card
        System.out.println("Would you like to draw a card? (Y/N):");
        String input = scanner.nextLine();

        while (input.equalsIgnoreCase("Y")) {
            // Draw a card
            Optional<Card> drawnCard = gameDeck.drawOne();

            if (drawnCard.isPresent()) {
                // Card successfully drawn
                Card card = drawnCard.get();
                System.out.println("You drew: " + card.getTitle());
                System.out.println("Number of cards remaining: " + gameDeck.getCardCount());
            } else {
                // No more cards in the deck
                System.out.println("No more cards in the deck!");
                break;
            }

            // Pyrompt the user to draw another card
            System.out.println("Would you like to draw another card? (Y/N):");
            input = scanner.nextLine();
        }

        System.out.println("Thank you for playing!");
    }
}
