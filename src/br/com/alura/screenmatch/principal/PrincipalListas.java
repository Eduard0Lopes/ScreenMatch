package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    static void main(String[] args) {
        Filme meuFilmeBaseAula = new Filme("O Poderoso Chefão", 1973);
        meuFilmeBaseAula.avalia(9);
        Filme meuFilmeBaseAula2 = new Filme("Avatar", 2023);
        meuFilmeBaseAula2.avalia(6);
        var filmeDoLuiz = new Filme("Dog ville", 2000);
        meuFilmeBaseAula2.avalia(10);
        var lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoLuiz;

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(filmeDoLuiz);
        listaAssistidos.add(meuFilmeBaseAula);
        listaAssistidos.add(meuFilmeBaseAula2);
        listaAssistidos.add(lost);


        for (Titulo item: listaAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassifica() > 2) {
                System.out.println("Classificacao " + filme.getClassifica());
            }

        }
    }
}
