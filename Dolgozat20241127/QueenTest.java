package Dolgozat20241127;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueenTest {
    Queen királyno = new Queen();

    @Test
    public void testQueens() {
        assertTrue(true == királyno.queens("4H", "3H"));
    }

    @Test
    public void testQueenss() {
        assertTrue(true == királyno.queens("8H", "A1"));
    }

    @Test
    public void testQueensss() {
        assertTrue(true == királyno.queens("A1", "8H"));
    }

    @Test
    public void testQueenssss() {
        assertTrue(false == királyno.queens("B1", "8H"));
    }
}
