package com.example;

import java.util.ArrayList;

/**
 * Representa un carriño de compra que xestiona unha lista de produtos
 */
public class CarrinhoCompra {

    private int numeroprods = 0;
    private ArrayList<Produto> lista = new ArrayList<>();

    /**
     * Añade un producto ao carriño
     * @param p produto a engadir
     */
    public void engadirProduto(Produto p) {
        this.lista.add(p);
        this.numeroprods = this.lista.size();
    }

    /**
     * @return número de produtos
     */
    public int getNumeroProdutos() {
        return this.numeroprods;
    }

    /**
     * Calcula el precio total de todos los produtos do carriño
     * @return suma total de prezos
     */
    public double calcularTotal() {
        double total = 0.0;
        for (Produto p : lista) {
            total += p.getPrezo();
        }
        return total;
    }

    /**
     * Elimina un produto do carriño
     * @param p producto que elimina
     */
    public void eliminarProduto(Produto p) {
        this.lista.remove(p);
        this.numeroprods = this.lista.size();
    }
}