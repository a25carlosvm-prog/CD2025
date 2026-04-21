package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XestorNotasTest {

    private final XestorNotas xestor = new XestorNotas("Carlos", new double[]{4.0, 6.0, 8.0});

    @Test
    void constructorPorDefecto() {
        XestorNotas anonimo = new XestorNotas();
        assertEquals("Anonimo", anonimo.getAlumno());
        assertEquals(0, anonimo.getNotas().length);
    }

    @Test
    void constructorConDatos() {
        assertEquals("Carlos", xestor.getAlumno());
        assertArrayEquals(new double[]{4.0, 6.0, 8.0}, xestor.getNotas());
    }

    @Test
    void setters() {
        xestor.setAlumno("María");
        xestor.setNotas(new double[]{9.0, 10.0});
        assertEquals("María", xestor.getAlumno());
        assertArrayEquals(new double[]{9.0, 10.0}, xestor.getNotas());
    }

    @Test
    void mediaConNotas() {
        assertEquals(6.0, xestor.calcularMedia(), 0.001);
    }

    @Test
    void mediaSenNotas() {
        assertEquals(0.0, new XestorNotas().calcularMedia());
    }

    @Test
    void maximoConNotas() {
        assertEquals(8.0, xestor.calcularMaximo(), 0.001);
    }

    @Test
    void maximoSenNotas() {
        assertEquals(0.0, new XestorNotas().calcularMaximo());
    }

    @Test
    void aprobado() {
        assertTrue(xestor.estaAprobado());
        xestor.setNotas(new double[]{2.0, 3.0});
        assertFalse(xestor.estaAprobado());
    }

    @Test
    void suspensos() {
        assertEquals(1, xestor.contarSuspensos());
        xestor.setNotas(new double[]{6.0, 7.0});
        assertEquals(0, xestor.contarSuspensos());
    }
}
