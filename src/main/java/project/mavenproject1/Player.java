/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author clind
 */

public class Player {
    private String name;
    private int handValue;
    private ArrayList<Card> handCards;
    private int wins;

    public Player(String name) {
        this.wins = 0;
        this.name = name;
        this.handValue = 0;
        this.handCards = new ArrayList<>(5);
    }
    public Player(String name, int wins) {
        this.wins = wins;
        this.name = name;
        this.handValue = 0;
        this.handCards = new ArrayList<>(5);
    }

    public Player() {
        this("Anonym");
    }

    

    public ArrayList<Card> getHandCards() {
        return handCards;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }
    



    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }


    public void setHandCards(ArrayList<Card> cards) {
        this.handCards = cards;
    }

    public void increaseHandValue(int handValue) {
        setHandValue(this.getHandValue() + handValue);

    }

    // public Deck addCard(Deck d) {
    //     Card nextCard = d.getCards().get(0);
    //     if (handCards.size() < 5) {
    //         handCards.add(nextCard);
    //         d.getCards().remove(0);
    //         this.increaseHandValue(getValueOfCard(nextCard));
    //     } else {
    //         System.out.println(this.getName() + "'s Hand is Full!!!");
    //     }
    //     return d;
    // }

    public int getValueOfCard(Card card) {
        int value = 0;
        switch(card.getValue()) {
            case TWO -> value = 2;
            case THREE -> value = 3;
            case FOUR -> value = 4;
            case FIVE -> value = 5;
            case SIX -> value = 6;
            case SEVEN -> value = 7;
            case EIGHT -> value = 8;
            case NINE -> value = 9;
            case TEN -> value = 10;
            case KING, JACK, QUEEN -> value = 10;
            case ACE -> value = this.getHandValue() <= 10 ? 11 : 1;
        }
        return value;
    }

    public void displayHand() {
        System.out.printf("%s's Total Score: %s%n", this.getName(), this.getHandValue());
        for (Card x : this.handCards) {
            System.out.print(x.getValue() + " " + x.getSuit() + ", ");
        }
        System.out.print("\n");
    }

    public void reset() {
        this.setHandValue(0);
        this.setHandCards(new ArrayList<Card>());
    }
    
    
}
