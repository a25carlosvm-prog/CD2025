package org.example;

/**
 * Xestor dunha conta bancaria cun titular e saldo
 */
public class ContaBancaria {

    /** Nome do titular da conta */
    private String titular;

    /** Saldo actual da conta */
    private double saldo;

    /** Número de operacións realizadas */
    private int numeroOperacions;

    /**
     * Constructor por defecto. Titular descoñecido e saldo cero
     */
    public ContaBancaria() {
        this.titular = "Descoñecido";
        this.saldo = 0.0;
        this.numeroOperacions = 0;
    }

    /**
     * Constructor con datos
     * @param titular nome do titular
     * @param saldoInicial saldo inicial da conta
     */
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroOperacions = 0;
    }

    /** @return nome do titular */
    public String getTitular() {
        return titular;
    }

    /** @param titular novo nome do titular */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /** @return saldo actual */
    public double getSaldo() {
        return saldo;
    }

    /** @return número de operacións realizadas */
    public int getNumeroOperacions() {
        return numeroOperacions;
    }

    /**
     * Ingresa unha cantidade na conta se é positiva
     * @param cantidade cantidade a ingresar
     */
    public void ingresar(double cantidade) {
        if (cantidade > 0) {
            saldo += cantidade;
            numeroOperacions++;
        }
    }

    /**
     * Retira unha cantidade se é positiva e hai saldo suficiente
     * @param cantidade cantidade a retirar
     * @return true se a operación foi exitosa
     */
    public boolean retirar(double cantidade) {
        if (cantidade > 0 && saldo >= cantidade) {
            saldo -= cantidade;
            numeroOperacions++;
            return true;
        }
        return false;
    }

    /**
     * @return comisión segundo o número de operacións: 0%, 1% ou 2% do saldo
     */
    public double calcularComision() {
        if (numeroOperacions < 5) {
            return 0;
        } else if (numeroOperacions <= 10) {
            return saldo * 0.01;
        } else {
            return saldo * 0.02;
        }
    }

    /**
     * Desconta do saldo a comisión calculada
     */
    public void aplicarComision() {
        double comision = calcularComision();
        saldo -= comision;
    }
}