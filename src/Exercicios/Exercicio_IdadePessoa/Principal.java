package Exercicios.Exercicio_IdadePessoa;

import Exercicios.exerciciosScreenMatch.exercicioIdadePessoa.IdadePessoa;

public class Principal {
    static void main() {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Luiz");
        pessoa.setIdade(17);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        pessoa.maiorIdade();
    }
}
