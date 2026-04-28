package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario de la biblioteca
 */
public class User {

    /** Identificador único del usuario */
    private String id;

    /** Nombre del usuario */
    private String name;

    /** Lista de préstamos activos máximo 3 */
    private List<Loan> loans;

    /**
     * Crea un usuario sin préstamos
     * @param id identificador único
     * @param name nombre del usuario
     */
    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<>();
    }

    /** @return nombre del usuario */
    public String getName() {
        return name;
    }

    /** @return id del usuario */
    public String getId() {
        return id;
    }

    /** @return lista de préstamos activos */
    public List<Loan> getLoans() {
        return loans;
    }

    /**
     * Añade un préstamo al usuario
     * @param loan préstamo a añadir
     * @throws IllegalStateException si ya tiene 3 préstamos
     */
    public void addLoan(Loan loan) {
        if (loans.size() >= 3) {
            throw new IllegalStateException("Max loans reached");
        }
        loans.add(loan);
    }

    /**
     * Elimina un préstamo del usuario
     * @param loan prestamo a eliminar
     */
    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }
}