package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int target = 21;
        boolean numIsClose;

        System.out.println("Enter player 1 name: " );
        String player1name = myObj.nextLine();

        System.out.println("Enter player 2 name: " );
        String player2name = myObj.nextLine();

        Deck deck = new Deck();
        deck.shuffle();

        Hand player1 = new Hand();
        Hand player2 = new Hand();


        player1.deal(deck.deal());
        player1.deal(deck.deal());

        player2.deal(deck.deal());
        player2.deal(deck.deal());

        player1.print();
        player2.print();





    }
}
