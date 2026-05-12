package com.example;

/**
 * Representa un produto cun nome e un prezo
 */
public class Produto {

    private String nome;
    private double prezo;

    /**
     * Crea un produto co nome e prezo indicados
     * @param nome do produto
     * @param prezo do produto
     * @throws IllegalArgumentException se o prezo é negativo ou o nome é nulo ou baleiro
     */
    public Produto(String nome, double prezo) {
        if (prezo < 0) {
            throw new IllegalArgumentException("O prezo non pode ser negativo");
        }
        if (nome == null) {
            throw new IllegalArgumentException("O nome non pode ser nulo");
        }
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome non pode estar baleiro");
        }
        this.nome = nome;
        this.prezo = prezo;
    }

    /**
     * Devolve o nome do produto
     * @return o nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @return prezo do produto
     */
    public double getPrezo() {
        return this.prezo;
    }

    /**
     * Establece un novo prezo para o produto
     * @param prezo novo
     * @throws IllegalArgumentException se o prezo é negativo
     */
    public void setPrezo(double prezo) {
        if (prezo < 0) {
            throw new IllegalArgumentException("O prezo non pode ser negativo");
        }
        this.prezo = prezo;
    }

    /**
     * Establece un novo nome para o produto
     * @param nome novo
     * @throws IllegalArgumentException se o nome é baleiro
     */
    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome non pode estar baleiro");
        }
        this.nome = nome;
    }
}