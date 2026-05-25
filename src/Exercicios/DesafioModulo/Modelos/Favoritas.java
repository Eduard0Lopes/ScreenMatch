package Exercicios.DesafioModulo.Modelos;

public class Favoritas {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "É o melhor!");
        } else {
            System.out.println(audio.getTitulo() + "Boa musica!");
        }
    }
}
