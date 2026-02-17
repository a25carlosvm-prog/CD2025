import java.util.ArrayList;
public class Autor {
    private String nombre;
    private String afiliacion;
    private ArrayList<Articulo> articulos;
    public Autor(String nombre, String afiliacion) {
        this.nombre = nombre;
        this.afiliacion = afiliacion;
        this.articulos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
}