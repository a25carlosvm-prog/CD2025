package com.example;

/**
 * Clase AlumnoManager.
 */
public class AlumnoManager {  // nombre de clase no CamelCase

  public static int contador = 0; // no final, visibilidad, espaciado, etc.
  private String nombre; // variable con mayúscula

  public AlumnoManager(String n) {
    nombre = n;
    contador++;
  } // llaves/espacios

  /**
  * Metodo addAlumno para añadir alumnos.
  *
  * @param name para el nombre.
  * @param edad para la edad.
  * @param notaMedia para la nota media.
  */
  public void addAlumno(String name, int edad, double notaMedia) {
    if (edad > 18) {
      System.out.println("Mayor");
    } else {
      System.out.println("Menor");
    } //todo en una línea
    int x = 3; // magic number + nombre pobre
    for (int i = 0; i < 10; i++) {
      System.out.println(i + ":" + name + "-" + notaMedia);
    } // braces y espacios
  }

  public String toString() {
    return "AlumnoManager{Nombre=" + nombre + ", contador=" + contador + "}";
  } // espacios raros

  public void setNombre(String nombre1) {
    this.nombre = nombre1;
  } // parámetro mismo nombre + mayúscula

  public String getNombre() {
    return nombre;
  } // sin espacios
}