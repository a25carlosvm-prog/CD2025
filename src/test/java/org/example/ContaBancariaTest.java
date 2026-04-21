package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {
    @Test
    void constructorPorDefecto() {
        ContaBancaria conta = new ContaBancaria();
        assertEquals("Descoñecido", conta.getTitular());
    }

    @Test
    void constructorConParametros() {
        ContaBancaria conta = new ContaBancaria("Juan", 500.0);
        assertEquals("Juan", conta.getTitular());
    }

    @Test
    void titularNulo() {
        assertThrows(IllegalArgumentException.class,
                () -> new ContaBancaria(null, 100.0));
    }
    @Test
    void ingresarNegativo() throws Exception{
        ContaBancaria conta = new ContaBancaria();
        conta.ingresar(-10);
    }
    @Test
    void ingresarCero() throws Exception{
        ContaBancaria conta = new ContaBancaria();
        conta.ingresar(0);
    }
    @Test
    void retirarNegativo() throws Exception{
        ContaBancaria conta = new ContaBancaria();
        conta.retirar(-10);
    }
    @Test
    void retirar0() throws Exception{
        ContaBancaria conta = new ContaBancaria();
        conta.retirar(0);
    }
    @Test
    void retirarSaldoMenor() throws Exception{
        ContaBancaria conta = new ContaBancaria();
        conta.retirar(999999999);
    }
    @Test
    void comisionTest() {
        ContaBancaria conta = new ContaBancaria("Juan", 1000.0);
        assertEquals(100.0, conta.getSaldo());
        assertEquals(0, conta.getNumeroOperacions());
    }
}
