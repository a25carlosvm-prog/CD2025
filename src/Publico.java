public class Publico extends Participante {
    private String institucion;
    public Publico(String nombre, String correo, String afiliacion, String institucion) {
        super(nombre, correo, afiliacion);
        this.institucion = institucion;
    }
    public String getInstitucion() {
        return institucion;
    }
}
