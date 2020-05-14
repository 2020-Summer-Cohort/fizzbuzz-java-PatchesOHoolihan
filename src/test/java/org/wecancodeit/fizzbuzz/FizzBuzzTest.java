package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*


*/
public class FizzBuzzTest {
    @Test
    public void shouldInstantiate() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldSayOne() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say( 1 );
        //assertion
        assertEquals( "1", result );
    }

    @Test
    public void twoShouldSayTwo() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 2 );
        assertEquals( "2", result );
    }

    @Test
    public void threeShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 3 );
        assertEquals( "Fizz", result );
    }

    @Test
    public void fourShouldSayFour() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 4 );
        assertEquals( "4", result );
    }

    @Test
    public void fiveShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 5 );
        assertEquals( "Buzz", result );
    }

    @Test
    public void sixShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 6 );
        assertEquals( "Fizz", result );
    }

    @Test
    public void nineShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 9 );
        assertEquals( "Fizz", result );
    }

    @Test
    public void tenShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 10 );
        assertEquals( "Buzz", result );
    }

    @Test
    public void fifteenShouldSayFiizBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 15 );
        assertEquals( "FizzBuzz", result );
    }
    @Test
    public void thirtyShouldSayFiizBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say( 30 );
        assertEquals( "FizzBuzz", result );
    }
}