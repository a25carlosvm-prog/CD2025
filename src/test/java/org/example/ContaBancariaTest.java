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
        assertEquals(1000.0, conta.getSaldo());
        assertEquals(0, conta.getNumeroOperacions());
    }
    @Test
    void setTitular() {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Pedro");
        assertEquals("Pedro", conta.getTitular());
    }

    @Test
    void ingresar() {
        ContaBancaria conta = new ContaBancaria();
        conta.ingresar(100.0);
        assertEquals(100.0, conta.getSaldo());
        assertEquals(1, conta.getNumeroOperacions());
    }

    @Test
    void retirar() {
        ContaBancaria conta = new ContaBancaria("Juan", 500.0);
        assertTrue(conta.retirar(100.0));
        assertEquals(400.0, conta.getSaldo());
        assertEquals(1, conta.getNumeroOperacions());
    }

    @Test
    void retirarSinSaldo() {
        ContaBancaria conta = new ContaBancaria("Juan", 50.0);
        assertFalse(conta.retirar(100.0));
    }

    @Test
    void calcularComisionSinOperacions() {
        ContaBancaria conta = new ContaBancaria("Juan", 1000.0);
        assertEquals(0.0, conta.calcularComision());
    }

    @Test
    void calcularComisionTramo1() {
        ContaBancaria conta = new ContaBancaria("Juan", 1000.0);
        for (int i = 0; i < 7; i++) conta.ingresar(10.0);
        assertEquals(conta.getSaldo() * 0.01, conta.calcularComision(), 0.001);
    }

    @Test
    void calcularComisionTramo2() {
        ContaBancaria conta = new ContaBancaria("Juan", 1000.0);
        for (int i = 0; i < 11; i++) conta.ingresar(10.0);
        assertEquals(conta.getSaldo() * 0.02, conta.calcularComision(), 0.001);
    }

    @Test
    void aplicarComision() {
        ContaBancaria conta = new ContaBancaria("Juan", 1000.0);
        for (int i = 0; i < 7; i++) conta.ingresar(10.0);
        double esperado = conta.getSaldo() - conta.calcularComision();
        conta.aplicarComision();
        assertEquals(esperado, conta.getSaldo(), 0.001);
    }
}
