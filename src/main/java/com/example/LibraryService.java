package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que gestiona libros, usuarios y prestamos
 */
public class LibraryService {

    /** Mapa de libros indexados por ISBN */
    private Map<String, Book> books = new HashMap<>();

    /** Mapa de usuarios indexados por id */
    private Map<String, User> users = new HashMap<>();

    /**
     * Registra un libro en el sistema
     * @param book libro a registrar
     * @throws IllegalArgumentException si el ISBN ya existe
     */
    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            throw new IllegalArgumentException("Book already exists");
        }
        books.put(book.getIsbn(), book);
    }

    /**
     * Registra un usuario en el sistema
     * @param user usuario a registrar
     * @throws IllegalArgumentException si el id ya existe
     */
    public void addUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
        users.put(user.getId(), user);
    }

    /**
     * Crea un préstamo entre un libro y un usuario
     * @param isbn ISBN del libro
     * @param userId id del usuario
     * @return préstamo creado
     * @throws IllegalArgumentException si el libro o usuario no existen
     */
    public Loan borrowBook(String isbn, String userId) {
        Book book = books.get(isbn);
        User user = users.get(userId);

        if (book == null || user == null) {
            throw new IllegalArgumentException("Invalid data");
        }

        book.borrow();

        Loan loan = new Loan(book, user);
        user.addLoan(loan);

        return loan;
    }

    /**
     * Cierra un préstamo y devuelve el libro
     * @param loan préstamo a cerrar
     * @throws IllegalStateException si el préstamo ya esta cerrado
     */
    public void returnBook(Loan loan) {
        if (!loan.isActive()) {
            throw new IllegalStateException("Loan already closed");
        }

        loan.closeLoan();
        loan.getBook().giveBack();
        loan.getUser().removeLoan(loan);
    }
}