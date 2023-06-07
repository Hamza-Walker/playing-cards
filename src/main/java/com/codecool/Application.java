package com.codecool;
import com.codecool.model.Card;
import com.codecool.model.Suit;
import com.codecool.model.Symbol;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Card card = new Card(Symbol.ACE, Suit.SPADES);
        Card card2 = new Card(Symbol.ACE, Suit.SPADES);

        //  It is still possible to change the fields of the objects after they have been created,
        //  because they have been implemented with a public setter method.

        System.out.println(card);
        System.out.println(card.equals(card2));

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        // We can add the Scanner to stop the debugger from
        // immediately exiting after the execution.
        // Instead, it will wait for hitting Enter to exit.

    }
}

