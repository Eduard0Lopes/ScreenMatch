package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifica;

public class Episodio implements Classifica {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualiza;

    public int getTotalVisualiza() {
        return totalVisualiza;
    }

    public void setTotalVisualiza(int totalVisualiza) {
        this.totalVisualiza = totalVisualiza;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassifica() {
        if (totalVisualiza > 100) {
            return 4;
        } return 2;
    }
}
