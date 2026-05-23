import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomenda;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main() {
        Filme meuFilmeBaseAula = new Filme();
        meuFilmeBaseAula.setNome("O Poderoso Chefão");
        meuFilmeBaseAula.setAnoLancamento(1973);
        meuFilmeBaseAula.setDuracaoEmMinutos(180);

        Filme meuFilmeBaseAula2 = new Filme();
        meuFilmeBaseAula2.setNome("Avatar");
        meuFilmeBaseAula2.setAnoLancamento(2023);
        meuFilmeBaseAula2.setDuracaoEmMinutos(200);


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.getAnoLancamento();
        lost.setTemporadas(10);
        lost.setEpisodiosTemporada(10);
        lost.setMinutosPorEpisodios(50);
       // System.out.println("Maratonar lost " + lost.getDuracaoEmMinutos());
        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilmeBaseAula);
        calculadora.inclui(meuFilmeBaseAula2);
        calculadora.inclui(lost);
       // System.out.println(calculadora.getTempoTotal());

        FiltroRecomenda filtro = new FiltroRecomenda();
      //  filtro.filtra(meuFilmeBaseAula);
        Episodio episidio = new Episodio();
        episidio.setNumero(1);
        episidio.setSerie(lost);
        episidio.setTotalVisualiza(300);
     //   filtro.filtra(episidio);

        var filmeDoLuiz = new Filme();
        filmeDoLuiz.setNome("Dog Ville");
        filmeDoLuiz.setDuracaoEmMinutos(200);
        filmeDoLuiz.setAnoLancamento(2000);
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
