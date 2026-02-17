public class Articulo {
    private String titulo;
    private String tema;
    private Autor autor;
    public Articulo(String titulo, String tema, Autor autor) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
}