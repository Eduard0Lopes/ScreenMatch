package Exercicios.Exercicio_Livro;

import Exercicios.exerciciosScreenMatch.exercicioLivro.Livro;

public class Principal {
    static void main() {
        Livro l1 = new Livro("Cronicas de Jaime", "Jaime");
        Livro l2 = new Livro("Cronicas de Joaquina", "Cirilo");
        l1.exibirDetalhes();
        l2.exibirDetalhes();
    }
}
