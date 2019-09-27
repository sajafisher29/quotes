package quotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testToString() {
        Quote aquote = new Quote("Razzle", "Chicken is the best");
        assertEquals(
                "instance variables are expected in the making of this string",
                "Razzle wrote this amazing quote: Chicken is the best",
                aquote.toString());
    }

    // checking functionality of constructor
//    @Test
//    public void testQuoteConstructor() {
//        assertEquals(
//                "something",
//
//        );
//    }
}