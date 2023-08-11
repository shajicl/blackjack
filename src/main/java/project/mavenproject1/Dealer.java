/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.mavenproject1;

/**
 *
 * @author clind
 */

public class Dealer extends Player {
    private Deck deck;
    public Dealer() {
        super("Dealer");
        this.deck = new Deck();
    }

    public void dealerPlays() {
        while (getHandValue() <= 16) {
            issueCard(this);
            this.displayHand();
        }
    }

    public Deck getDeck() {
        return deck;
    }

    public void issueCard(Player player) {
        Card nextCard = getDeck().getCards().get(0);
        if (player.getHandCards().size() < 5) {
            player.getHandCards().add(nextCard);
            getDeck().removeCard();
            player.increaseHandValue(getValueOfCard(nextCard));
        } else {
            System.out.println(player.getName() + "'s Hand is Full!!!");
        }
    }

    public void initializeHands(Player player) {
        issueCard(player);
        issueCard(player);
        issueCard(this);
        issueCard(this);
    }

    public void displayHiddenHand() {
        System.out.printf("%s's Current Score: %s%n", this.getName(), getValueOfCard(this.getHandCards().get(0)));
        System.out.print(this.getHandCards().get(0).getValue() + " " + this.getHandCards().get(0).getSuit() + " + HIDDEN CARD\n");
    }

    void initializeDeck(Deck expResult) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
}