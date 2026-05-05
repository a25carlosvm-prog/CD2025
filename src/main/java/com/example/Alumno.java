package com.example;

/**
 * Clase que representa un alumno con sus datos básicos
 */
public class Alumno {

    private String nombre;
    private int edad;
    private double notaMedia;

    /**
     * Constructor vacío de la clase Alumno
     */
    public Alumno() {
    }

    /**
     * Crea un alumno con todos sus datos
     * @param nombre nombre del alumno
     * @param edad edad del alumno
     * @param notaMedia nota media del alumno
     */
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    /**
     * Devuelve el nombre del alumno
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad del alumno
     * @return edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Cambia la edad del alumno
     * @param edad nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve la nota media del alumno
     * @return nota media
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * Cambia la nota media del alumno
     * @param notaMedia nueva nota media
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}