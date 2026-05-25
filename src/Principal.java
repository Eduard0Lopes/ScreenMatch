import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomenda;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main() {
        Filme meuFilmeBaseAula = new Filme("O Poderoso Chefão", 1973);
        meuFilmeBaseAula.setDuracaoEmMinutos(180);

        Filme meuFilmeBaseAula2 = new Filme("Avatar", 2023);
        meuFilmeBaseAula2.setDuracaoEmMinutos(200);


        var lost = new Serie("Lost", 2000);
        lost.getAnoLancamento();
        lost.setTemporadas(10);
        lost.setEpisodiosTemporada(10);
        lost.setMinutosPorEpisodios(50);
       // System.out.println("Maratonar lost " + lost.getDuracaoEmMinutos());
        var calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilmeBaseAula);
        calculadora.inclui(meuFilmeBaseAula2);
        calculadora.inclui(lost);
       // System.out.println(calculadora.getTempoTotal());

        var filtro = new FiltroRecomenda();
      //  filtro.filtra(meuFilmeBaseAula);
        Episodio episidio = new Episodio();
        episidio.setNumero(1);
        episidio.setSerie(lost);
        episidio.setTotalVisualiza(300);
     //   filtro.filtra(episidio);

        var filmeDoLuiz = new Filme("Dog ville", 2000);
        filmeDoLuiz.setDuracaoEmMinutos(200);
        filmeDoLuiz.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLuiz);
        listaDeFilmes.add(meuFilmeBaseAula);
        listaDeFilmes.add(meuFilmeBaseAula2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());

    }
}
