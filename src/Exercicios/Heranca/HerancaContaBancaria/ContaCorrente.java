package Exercicios.Heranca.HerancaContaBancaria;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa de " + tarifaMensal + "cobrada, novo saldo: " + saldo);
    }
}
