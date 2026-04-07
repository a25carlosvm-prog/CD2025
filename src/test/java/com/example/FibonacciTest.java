package com.example;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void fibonaccimenorauno() throws Exception {
        Fibonacci f =new Fibonacci();

        Exception exception = assertThrows(Exception.class, () -> {
            f.fibonacci(-1);
        });

        assertEquals("Error. El número tiene que ser >=0", exception.getMessage());
    }

    @Test
    void fivonacciigualacero() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.ZERO, f.fibonacci(0));
    }

    @Test
    void fivonacciigualauno() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.ONE, f.fibonacci(1));
    }

    @Test
    void fivonaccideCinco() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.valueOf(5),f.fibonacci(5));
    }

    @Test
    void fivonaccideDiez() throws Exception {
        Fibonacci f = new Fibonacci();
        assertEquals(BigInteger.valueOf(55),f.fibonacci(10));
    }
}
