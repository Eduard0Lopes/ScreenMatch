package exercicio_1_metodos;

public class Filme {
    String nome;
    int anoFilme;
    double totalAvaliacao;
    double somaAvaliacao;

    void mostraFicha() {
        System.out.println("Filme do mi dengo é: " + nome);
        System.out.println("Lançado em: " + anoFilme);
    }

    void notaFilme(double nota) {
        totalAvaliacao += nota;
        somaAvaliacao++;
    }

    double mediaAvalicao() {
        return totalAvaliacao / somaAvaliacao;
    }
}

