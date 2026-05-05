package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Clase que gestiona una lista de alumnos y sus operaciones.
 */
public class AlumnoManager {
    private static final Logger logger = Logger.getLogger(AlumnoManager.class.getName());
    private List<Alumno> alumnos = new ArrayList<>();
    /**
     * Añade un alumno a la lista si no es nulo.
     * @param a alumno a añadir
     */
    public void agregarAlumno(Alumno a) {
        if (a != null) {
            alumnos.add(a);
        }
    }

    /**
     * Busca un alumno por su nombre dentro de la lista.
     * @param nombre nombre del alumno
     * @return alumno encontrado o null si no existe
     */
    public Alumno buscarAlumnoPorNombre(String nombre) {
        for (Alumno a : alumnos) {
            if (a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    /**
     * Calcula la media de las notas de todos los alumnos.
     * @return media de notas o 0 si no hay alumnos
     */
    public double calcularMedia() {
        double suma = 0;

        for (Alumno a : alumnos) {
            suma += a.getNotaMedia();
        }

        if (alumnos.isEmpty()) {
            return 0;
        }

        return suma / alumnos.size();
    }

    /**
     * Clasifica a un alumno según su nota y edad.
     * @param a alumno a clasificar
     * @return clasificación del alumno
     */
    public String clasificarAlumno(Alumno a) {
        if (a == null) return "Alumno nulo";

        if (a.getNotaMedia() >= 9 && a.getEdad() >= 18) return "Sobresaliente adulto";
        if (a.getNotaMedia() >= 9) return "Sobresaliente menor";
        if (a.getNotaMedia() >= 7 && a.getEdad() >= 18) return "Notable adulto";
        if (a.getNotaMedia() >= 7) return "Notable menor";
        if (a.getNotaMedia() >= 5 && a.getEdad() >= 18) return "Aprobado adulto";
        if (a.getNotaMedia() >= 5) return "Aprobado menor";
        if (a.getEdad() >= 18) return "Suspenso adulto";

        return "Suspenso menor";
    }

    /**
     * Muestra por log los alumnos que han aprobado.
     */
    public void mostrarAlumnosAprobados() {
        for (Alumno a : alumnos) {
            if (a.getNotaMedia() >= 5) {
                logger.info("Alumno aprobado: " + a.getNombre());
            }
        }
    }

    /**
     * Muestra por log los alumnos que han suspendido.
     */
    public void mostrarAlumnosSuspensos() {
        for (Alumno a : alumnos) {
            if (a.getNotaMedia() < 5) {
                logger.info("Alumno suspenso: " + a.getNombre());
            }
        }
    }
}