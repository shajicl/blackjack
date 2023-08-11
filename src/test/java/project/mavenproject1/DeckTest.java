/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package project.mavenproject1;

import java.util.ArrayList;
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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Deck.
     */
    @Test
    public void testGetCardsGood() {
        System.out.println("getCards");
        Deck instance = new Deck();
        
        ArrayList<Card> result = instance.getCards();
        
        assertNotNull(result);
        assertFalse(result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetCardsBad() {
        System.out.println("getCards");
        Deck instance = new Deck();
        
        ArrayList<Card> result = instance.getCards();
        
        assertNotNull(result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetCardsBoundary() {
        System.out.println("getCards");
        Deck instance = new Deck();
        
        ArrayList<Card> result = instance.getCards();
        
        assertTrue(result.size() >= 52 && result.size() <= 52);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Deck.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Deck instance = new Deck();
        instance.removeCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
