/**
 * Clase Persona
 * @author xulio
 */
public class Persona {
    /**
     * @param nombre
     * @param edad
     */
    private String nombre;
    private int edad;

    /**
     * Constructor de Persona
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo que devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que cambia el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve la edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que cambia la edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que imprime nombre y edad
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}