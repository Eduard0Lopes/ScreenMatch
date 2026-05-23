package br.com.alura.screenmatch.calculos;

public class FiltroRecomenda {

    public void filtra(Classifica classifica) {
        if (classifica.getClassifica() >= 4) {
            System.out.println("Preferido");
        } else if (classifica.getClassifica() >= 2) {
            System.out.println("Bem avaliado");
        } else {
            System.out.println("Coloque na sua lista depois");
        }
    }
}
