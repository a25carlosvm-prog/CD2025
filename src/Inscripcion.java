import java.util.Date;
public class Inscripcion {
    private Date fechaInscripcion;
    private String estado; // "CONFIRMADA" o "CANCELADA"
    private Participante participante;
    private Conferencia conferencia;
    public Inscripcion(Date fechaInscripcion, String estado, Participante participante, Conferencia conferencia) {
        this.fechaInscripcion = fechaInscripcion;
        this.estado = estado;
        this.participante = participante;
        this.conferencia = conferencia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}