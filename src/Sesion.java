import java.util.ArrayList;
import java.util.Date;
public class Sesion {
    private Date fecha;
    private String horaInicio;
    private String titulo;
    private Conferencia conferencia;
    private ArrayList<Articulo> articulos;
    public Sesion(Date fecha, String horaInicio, String titulo, Conferencia conferencia) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.titulo = titulo;
        this.conferencia = conferencia;
        this.articulos = new ArrayList<>();
    }
    public Date getFecha() {
        return fecha;
    }
    public String getHoraInicio() {
        return horaInicio;
    }
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
}