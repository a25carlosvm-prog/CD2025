public class ArticuloCorto extends Articulo {
    private int numPaginas;
    public ArticuloCorto(String titulo, String tema, Autor autor, int numPaginas) {
        super(titulo, tema, autor);
        this.numPaginas = numPaginas;
    }
}