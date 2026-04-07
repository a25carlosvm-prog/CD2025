package com.example;

import java.math.BigInteger;

/**
 * Clase fibonacci BigInteger
 * @author Carlos
 * Calcula números de la serie de Fibonacci
 */
public class Fibonacci {

    /**
     * @param n número entero >= 0
     * @return número de Fibonacci
     * @throws Exception si n es negativa
     */
    public BigInteger fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger anterior = BigInteger.ZERO;
        BigInteger actual = BigInteger.ONE;
        BigInteger resultado = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            resultado = anterior.add(actual);
            anterior = actual;
            actual = resultado;
        }

        return actual;
    }
}
