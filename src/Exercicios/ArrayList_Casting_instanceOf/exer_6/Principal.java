package Exercicios.ArrayList_Casting_instanceOf.exer_6;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1001, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(2002, 3500.0);
        ContaBancaria conta3 = new ContaBancaria(3003, 7500.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("A Conta com maior saldo seria a " + contaMaiorSaldo.getNumeroConta() + ", com saldo de: " + contaMaiorSaldo.getSaldo());
    }
}
