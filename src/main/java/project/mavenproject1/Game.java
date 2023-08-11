/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author clind
 */


public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your name to play!");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        Dealer dealer = new Dealer();
        Player player = new Player(playerName);
        System.out.println("Welcome to the Java Blackjack table!");
        outer:
        while (true) {
            System.out.println(" ");
            System.out.println("Enter: (play) to Play");
            System.out.println("Enter: (anything else) to Quit");
            if (!input.nextLine().trim().toLowerCase().equals("play")) {
                break;
            }
            System.out.println("New game started!");
            dealer.initializeHands(player);
            dealer.displayHiddenHand();
            player.displayHand();
            while (true) {
                System.out.println(" ");
                System.out.println(player.getName() + ", enter your decision:");
                System.out.println("(stand) to Stand");
                System.out.println("(anything else) to Hit");
                if (input.nextLine().trim().toLowerCase().equals("stand")) {
                    break;
                }
                dealer.issueCard(player);
                player.displayHand();
                if (player.getHandValue() > 21) {
                    System.out.println(player.getName() + " is busted (exceeded 21 point)");
                    determineWinner(player, dealer);
                    continue outer;
                }
            }
            System.out.println("\n***********");
            dealer.displayHand();
            System.out.println("Dealer is playing");
            dealer.dealerPlays();
            determineWinner(player, dealer);
        }
        System.out.println(playerName + "'s wins: " + player.getWins());
        System.out.println("Dealer's wins: " + dealer.getWins());
        input.close();
    }

    public static void determineWinner(Player p, Player d) {
        int pHandValue = p.getHandValue();
        int dHandValue = d.getHandValue();
        if ((pHandValue > dHandValue && (p.getHandValue() <= 21)) || d.getHandValue() > 21) {
            System.out.println(p.getName() + " wins! Final score is " + p.getHandValue());
            p.setWins((p.getWins() + 1));

        } else if (pHandValue == dHandValue) {
            System.out.println("Draft!");
        } else {
            System.out.println("Dealer Wins!");
            d.setWins((d.getWins() + 1));
        }
        System.out.println(p.getName() + "'s score = " + pHandValue + ", and Dealer's Score = " + dHandValue);
        p.reset();
        d.reset();
    }
    
}
