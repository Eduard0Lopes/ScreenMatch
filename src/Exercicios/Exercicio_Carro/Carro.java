package Exercicios.Exercicio_Carro;

public class Carro {
    String modelo;
    String cor;
    int ano;

    void mostraFicha() {
        System.out.println("O Modelo do carro é: " + modelo);
        System.out.println("O Ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
        System.out.println("A Idade do carro é: " + idadeCarro() + " Anos.");

// Decidi criar esse verificador de IPVA, para dificultar o exercicio e trabalhar com if/else.

        if (ipva()) {
            System.out.println("Este veículo paga IPVA.");
        } else {
            System.out.println("Este veículo NÃO paga IPVA.");
        }
    }
    int idadeCarro() {
        return 2026 - ano;
    }

    boolean ipva() {
        return idadeCarro() <= 20;
    }
}
