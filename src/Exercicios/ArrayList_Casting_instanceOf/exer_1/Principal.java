package Exercicios.ArrayList_Casting_instanceOf.exer_1;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Angular");
        lista.add("Golang");

        lista.forEach(System.out::println);
    }
}
