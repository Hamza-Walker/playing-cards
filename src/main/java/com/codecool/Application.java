package com.codecool;
import com.codecool.Data.GenerateCards;
import com.codecool.model.Card;
import com.codecool.model.Suit;
import com.codecool.model.Symbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Card card1 = new Card(Symbol.ACE, Suit.SPADES);
        Card card2 = new Card(Symbol.ACE, Suit.SPADES);

        //  It is still possible to change the fields of the objects after they have been created,
        //  because they have been implemented with a public setter method.

        System.out.println(card1);
        System.out.println(card1.equals(card2));

        // Scanner scanner = new Scanner(System.in);
        // scanner.nextLine();
        // We can add the Scanner to stop the debugger from
        // immediately exiting after the execution.
        // Instead, it will wait for hitting Enter to exit.

        // printing the deck
        GenerateCards generateCards = new GenerateCards(); // Create an instance of GenerateCards
        ArrayList<Card> deck = GenerateCards.getDeck(); // Obtain the deck of cards

        for (Card card: deck) {
            System.out.println(card.getTitle());
        }

    }
}

