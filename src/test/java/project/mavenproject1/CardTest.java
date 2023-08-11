/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package project.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author clind
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("getValue");
        Card instance = new Card(Value.ACE, Suit.HEART);
        Value expResult = Value.ACE;
        Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetValueBad() {
        System.out.println("getValue");
        Card instance = new Card(Value.KING, Suit.DIAMOND);
        Value expResult = Value.KING;
        Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetValueBoundary() {
        System.out.println("getValue");
        Card instance = new Card(Value.TWO, Suit.CLUB);
        Value expResult = Value.TWO;
        Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuit");
        Card instance = new Card(Value.ACE, Suit.HEART);
        Suit expResult = Suit.HEART;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSuitBad() {
        System.out.println("getSuit");
        Card instance = new Card(Value.KING, Suit.DIAMOND);
        Suit expResult = Suit.DIAMOND;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetSuitBoundary() {
        System.out.println("getSuit");
        Card instance = new Card(Value.TWO, Suit.CLUB);
        Suit expResult = Suit.CLUB;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
