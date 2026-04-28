package com.example;

/**
 * Clase que representa un libro
 */
public class Book {

    /** ISBN único del libro */
    private String isbn;
    /** Titulo del libro */
    private String title;
    /** true si el libro esta disponible para préstamo */
    private boolean available;
    /**
     * Crea un libro disponible
     * @param isbn identificador único
     * @param title título del libro
     */
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.available = true;
    }

    /**
     * @return ISBN del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return título del libro
     */
    public String getTitle() {
        return title;
    }

    /** @return true si está disponible */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Marca el libro como prestado
     * @throws IllegalStateException si no está disponible
     */
    public void borrow() {
        if (!available) {
            throw new IllegalStateException("Book not available");
        }
        available = false;
    }

    /** Marca el libro como disponible */
    public void giveBack() {
        available = true;
    }
}