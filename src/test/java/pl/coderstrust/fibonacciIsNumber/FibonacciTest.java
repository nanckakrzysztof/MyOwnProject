package pl.coderstrust.fibonacciIsNumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    @Test
    public void shouldReturnIsFibonacciNumber() {
        //given
        long number = 9223372036854775807L;
        IsFibonacci fibonacci = new IsFibonacci();
        //when
        boolean result = fibonacci.checkNumberIsFibonnacci(number);
        //then
        assertTrue(result);
    }
    @Test
    public void shouldReturnIsNotFibonacciNumber() {
        //given
        long number = 2100000000;
        IsFibonacci fibonacci = new IsFibonacci();
        //when
        boolean result = fibonacci.checkNumberIsFibonnacci(number);
        //then
        assertFalse(result);
    }

}
