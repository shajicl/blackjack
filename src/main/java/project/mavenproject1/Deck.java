/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.mavenproject1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author clind
 */

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>(52);
        for (Value value : Value.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(value, suit));
            }
        }
        this.shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void removeCard() {
        this.cards.remove(0);
    }

    
}
