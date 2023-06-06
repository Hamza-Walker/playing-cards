package com.codecool;
import com.codecool.model.Card;
import com.codecool.model.Suit;
import com.codecool.model.Symbol;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Card card = new Card(Symbol.A, Suit.SPADES);

        System.out.println(card.getSymbol() + " of " + card.getSuit());
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        // We can add the Scanner to stop the debugger from
        // immediately exiting after the execution.
        // Instead, it will wait for hitting Enter to exit.

    }
}

