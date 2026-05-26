package Exercicios.CollectionsSort.exerc_2_e_3;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }
    }
}
