package Exercicio_ContaBancaria;

import br.com.alura.screenmatch.exercicioContaBancaria.ContaBancaria;

public class Principal_ContaBancaria {
    static void main() {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(12345);
        c1.setSaldoConta(-12);
        c1.setTitular("Dudu");

        System.out.println("Conta: " + c1.getNumeroConta());
        System.out.println("Saldo é: " + c1.getSaldoConta());
        System.out.println("Titular: " + c1.getTitular());
    }
}
