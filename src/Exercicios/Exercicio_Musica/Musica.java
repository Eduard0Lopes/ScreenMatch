package Exercicios.Exercicio_Musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void mostraFicha() {
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Compositor: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avaliacao);
        System.out.println("A média de avaliações é: " + mediaMusica());
    }
    void avaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaMusica() { return avaliacao / numAvaliacoes; }
}
