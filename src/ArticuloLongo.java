public class ArticuloLongo extends Articulo {
    private int numPaginas;
    public ArticuloLongo(String titulo, String tema, Autor autor, int numPaginas) {
        super(titulo, tema, autor);
        this.numPaginas = numPaginas;
    }
}