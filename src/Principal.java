import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomenda;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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
        System.out.println("Maratonar lost " + lost.getDuracaoEmMinutos());
        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilmeBaseAula);
        calculadora.inclui(meuFilmeBaseAula2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomenda filtro = new FiltroRecomenda();
        filtro.filtra(meuFilmeBaseAula);
        Episodio episidio = new Episodio();
        episidio.setNumero(1);
        episidio.setSerie(lost);
        episidio.setTotalVisualiza(300);
        filtro.filtra(episidio);

    }
}
