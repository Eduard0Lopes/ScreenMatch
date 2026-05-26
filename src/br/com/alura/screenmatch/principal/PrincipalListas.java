package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

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

        List<Titulo> listaAssistidos = new LinkedList<>();
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

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Ana");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Pos ordenacao " + buscaPorArtista);
        Collections.sort(listaAssistidos);
        System.out.println("Lista de titulos " + listaAssistidos);
        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(listaAssistidos);
    }
}
