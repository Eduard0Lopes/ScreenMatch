package br.com.alura.screenmatch.Aula.modelos;

public class Filme_BaseAula {
    private String nome;
    private int anoLancamento;
    private double somaAvaliacao;
    private boolean incluidoPlano;
    private int totalAvaliacao;
    private int duracaoEmMinutos;



    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFicha() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public double obtemMedia() {
        return somaAvaliacao / totalAvaliacao;
    }
}
