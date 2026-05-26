package Exercicios.CollectionsSort.exerc_1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista Ordenada" + numeros);
    }
}
