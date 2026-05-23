package br.com.alura.DesafioModulo.Modelos;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int curtidas;
    private int classificacao;

    public void curte() {
    this.curtidas++;
    }

    public void reproduz(){
    this.totalReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public int getClassificacao() {
        return classificacao;
    }
}
