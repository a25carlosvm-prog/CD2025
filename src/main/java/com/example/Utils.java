package com.example;

/**
 * Clase Utils.
 */
public class Utils { // nombre demasiado genérico para ejercicio

  /**
  *Metodo doStuff que hace algo.
  *
  * @param a que define algo.
  * @param b que define algo.
  * @return r o null.
  */
  public static String doStuff(String a, String b) {
    // método largo, sin javadoc, nombres pobres
    String r = a + b;
    if (r.length() > 120) {
      System.out.println("too long: " + r);
    } // line length
    if (a == null || b == null) {
      return null;
    } // braces ausentes si tu config lo exige
    try {
      if (a.trim().equals("") || b.trim().equals("")) {
        throw new RuntimeException("bad");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } // catch genérico + printStackTrace
    return r;
  }

  public static void  calc(int a, int b) { // método no lowerCamelCase + espacios raros
    int res = a * b + 42; // magic number
    System.out.println("res = " + res);
  }
}