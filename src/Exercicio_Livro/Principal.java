package Exercicio_Livro;

import br.com.alura.screenmatch.exercicioLivro.Livro;

public class Principal {
    static void main() {
        Livro l1 = new Livro("Cronicas de Jaime", "Jaime");
        Livro l2 = new Livro("Cronicas de Joaquina", "Cirilo");
        l1.exibirDetalhes();
        l2.exibirDetalhes();
    }
}
