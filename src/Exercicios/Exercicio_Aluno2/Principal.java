package Exercicios.Exercicio_Aluno2;

import Exercicios.exerciciosScreenMatch.Aluno.Exercicio2_Aluno;

public class Principal {
    static void main() {
        Exercicio2_Aluno aluno1 = new Exercicio2_Aluno("Luiz", 10, 5, 9);
        Exercicio2_Aluno aluno2 = new Exercicio2_Aluno("Rogerio", 8, 6, 4);

        System.out.println("Aluno 1");
        System.out.println("Aluno " + aluno1.getNome());
        System.out.println("Notas: " + aluno1.getNota1() + ", " + aluno1.getNota2() + ", " + aluno1.getNota3() + ". Com média de: " + aluno1.retornaMedia());

        System.out.println("Aluno 2");
        System.out.println("Aluno " + aluno2.getNome());
        System.out.println("Notas: " + aluno2.getNota1() + ", " + aluno2.getNota2() + ", " + aluno2.getNota3() + ". Com média de: " + aluno2.retornaMedia());
    }
}
