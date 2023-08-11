/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.mavenproject1;

/**
 *
 * @author clind
 */

public class Card {
    private Value Value;
    private Suit Suit;

    public Card(Value value, Suit suit) {
        this.Value = value;
        this.Suit = suit;
    }
    
    public Value getValue() {
        return Value;
    }

    public Suit getSuit() {
        return Suit;
    }    
}
enum Value {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
enum Suit {HEART, DIAMOND, SPADE, CLUB};