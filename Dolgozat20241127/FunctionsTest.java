package Dolgozat20241127;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionsTest {
    Functions functions = new Functions();

    @Test
    public void dividersNumberTesztKetovel() {
        assertTrue(2 == functions.dividersNumber(3));
    }

    @Test
    public void dividersNumberTesztTizel() {
        assertTrue(4 == functions.dividersNumber(10));
    }

    @Test
    public void maxOfThree123() {
        assertTrue(3 == functions.maxOfThree(1, 2, 3));
    }

    @Test
    public void maxOfThree333() {
        assertTrue(3 == functions.maxOfThree(3, 3, 3));
    }

    @Test
    public void fizzBuzzfizz() {
        assertTrue("Fizz" == functions.fizzBuzz(3));
    }

    @Test
    public void fizzBuzzBuzz() {
        assertTrue("Buzz" == functions.fizzBuzz(5));
    }

    @Test
    public void fizzBuzzfizzBuzz() {
        assertTrue("FizzBuzz" == functions.fizzBuzz(15));
    }

    @Test
    public void fizzBuzz2() {
        assertTrue("2" == functions.fizzBuzz(2));
    }

    @Test
    public void isVowelA(){
        assertTrue(true == functions.isVowel('A'));
    }

    @Test
    public void isVowelB(){
        assertTrue(false == functions.isVowel('B'));
    }
}
