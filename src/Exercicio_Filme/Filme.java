package Exercicio_Filme;

public class Filme {
  String nome;
  int anoLancamento;
  double avaliacao;
  double somaAvaliacao;

  void mostraFicha() {
      System.out.println("Filme: " + nome);
      System.out.println("Ano: " + anoLancamento);
      System.out.println("Avaliacao: " + avaliacao);
      System.out.println("Media Avalicao " + mediaAvaliacao());
  }

  void totalNota(double nota) {
      avaliacao += nota;
      somaAvaliacao++;
  }

  double mediaAvaliacao() { return avaliacao / somaAvaliacao; }
}

