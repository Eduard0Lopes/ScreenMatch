package Exercicios.HerancaContaBancaria;

public class TestarConta {
    static void main() {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(22200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.sacar(15000);
        contaCorrente.consultarSaldo();
    }
}
