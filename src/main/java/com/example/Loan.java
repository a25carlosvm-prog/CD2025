package com.example;
import java.time.LocalDate;

/**
 * Clase Loan de préstamos
 */
public class Loan {

    /** Libro prestado */
    private Book book;

    /** Usuario que realiza el préstamo */
    private User user;

    /** Fecha de inicio del préstamo */
    private LocalDate startDate;

    /** Fecha de cierre del préstamo null si sigue activo */
    private LocalDate endDate;

    /**
     * Crea un préstamo activo con fecha de hoy
     * @param book libro a prestar
     * @param user usuario que lo solicita
     */
    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.startDate = LocalDate.now();
    }

    /** @return libro del prestamo */
    public Book getBook() {
        return book;
    }

    /** @return usuario del prestamo */
    public User getUser() {
        return user;
    }

    /** @return fecha de inicio */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** Cierra el prestamo con la fecha de hoy */
    public void closeLoan() {
        this.endDate = LocalDate.now();
    }

    /** @return true si el prestamo sigue abierto */
    public boolean isActive() {
        return endDate == null;
    }
}