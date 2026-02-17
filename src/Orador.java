public class Orador extends Participante {
    private String biografia;
    public Orador(String nombre, String correo, String afiliacion, String biografia) {
        super(nombre, correo, afiliacion);
        this.biografia = biografia;
    }
    public String getBiografia() {
        return biografia;
    }
}