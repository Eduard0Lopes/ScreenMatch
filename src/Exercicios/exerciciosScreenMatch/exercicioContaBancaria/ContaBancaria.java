package Exercicios.exerciciosScreenMatch.exercicioContaBancaria;

public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        if (saldoConta >= 0) {
            this.saldoConta = saldoConta;
        } else {
            System.out.println("Saldo Invalido");
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public String getTitular() {
        return titular;
    }
}
