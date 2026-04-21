package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {
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
}
