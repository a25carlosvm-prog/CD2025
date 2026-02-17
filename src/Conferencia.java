import java.util.ArrayList;
import java.util.Date;
public class Conferencia {
    private String nombre;
    private String lugar;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<Sesion> sesiones;
    private ArrayList<Inscripcion> inscripciones;
    public Conferencia(String nombre, String lugar, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sesiones = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }
    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}