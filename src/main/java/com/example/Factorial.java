package com.example;

import java.math.BigInteger;

/**
 * Calcula el factorial de un número entero no negativo
 */
public class Factorial {

    /**
     * Devuelve el factorial de n
     * @param n número entero mayor o igual a 0
     * @return factorial de n
     * @throws Exception si n es negativo
     */
    public BigInteger factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        BigInteger resultado = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}
