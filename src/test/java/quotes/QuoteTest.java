package quotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testToString() {
        Quote aquote = new Quote("Razzle", "Chicken is the best");
        assertEquals(
                "Razzle says Chicken is the best",
                aquote.toString());
    }

}