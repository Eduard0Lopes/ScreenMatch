package Exercicios.Arrays.Pessoa;

import java.util.ArrayList;

public class Principal {
    static void main() {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        var pessoa1 = new Pessoa("Luiz", 24);

        var pessoa2 = new Pessoa("Sofia", 26);

        var pessoa3 = new Pessoa("Salazar", 9);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaPessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaPessoas.get(0));
        System.out.println(listaPessoas);
    }
}
