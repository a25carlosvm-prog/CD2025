package org.example;

/**
 * Xestor de notas dun alumno
 */
public class XestorNotas {

    /** Nome do alumno */
    private String alumno;

    /** Notas do alumno */
    private double[] notas;

    /**
     * Constructor por defecto. Alumno anónimo e sen notas
     */
    public XestorNotas() {
        this.alumno = "Anonimo";
        this.notas = new double[0];
    }

    /**
     * Constructor con datos
     * @param alumno nome do alumno
     * @param notas array de notas
     */
    public XestorNotas(String alumno, double[] notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    /** @return nome do alumno */
    public String getAlumno() {
        return alumno;
    }

    /** @param alumno novo nome do alumno */
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    /** @return array de notas */
    public double[] getNotas() {
        return notas;
    }

    /** @param notas novo array de notas */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * @return media das notas, 0 se non hai notas
     */
    public double calcularMedia() {
        if (notas.length == 0) {
            return 0;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }

    /**
     * @return nota máxima, 0 se non hai notas
     */
    public double calcularMaximo() {
        if (notas.length == 0) {
            return 0;
        }

        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }

        return max;
    }

    /**
     * @return true se a media é >= 5
     */
    public boolean estaAprobado() {
        return calcularMedia() >= 5;
    }

    /**
     * @return número de notas inferiores a 5
     */
    public int contarSuspensos() {
        int contador = 0;
        for (double nota : notas) {
            if (nota < 5) {
                contador++;
            }
        }
        return contador;
    }
}