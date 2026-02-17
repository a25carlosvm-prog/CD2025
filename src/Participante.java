public class Participante {
    private String nombre;
    private String correo;
    private String afiliacion;
    public Participante(String nombre, String correo, String afiliacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.afiliacion = afiliacion;
    }
    public String getNombre() {
        return nombre;
    }
}