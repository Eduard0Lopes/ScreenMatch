public class Filme {
    String nome;
    int anoLancamento;
//    boolean incluidoPlano;
    double somaAvaliacao;
    int totalAvaliacao;
    int duracaoEmMinutos;

    void exibeFicha() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    double obtemMedia() {
        return somaAvaliacao / totalAvaliacao;
    }
}
