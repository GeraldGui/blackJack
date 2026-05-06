package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int target = 21;

        System.out.print("Enter player 1 name: " );
        String player1name = myObj.nextLine();

        System.out.print("Enter player 2 name: " );
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

        int player1Score = player1.getValue();
        int player2Score = player2.getValue();

        if (player1Score <= target && (player1Score > player1Score || player2Score > target)) {
            System.out.println(player1name + "Wins");
        } else if (player2Score <= 21 && (player2Score > player1Score || player1Score > target)) {
            System.out.println(player2name + "Wins");
        } else {
            System.out.println("It's a tie.");
        }
        myObj.close();
    }
}
