package Exercicios.DesafioModulo;

import Exercicios.DesafioModulo.Modelos.Favoritas;
import Exercicios.DesafioModulo.Modelos.Musica;
import Exercicios.DesafioModulo.Modelos.Podcast;

public class Principal {
    static void main() {
        Musica musica = new Musica();
        
        musica.setTitulo("Numb ");
        musica.setArtista("Linkin Park ");
        
        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }
        
        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow Podcast ");
        podcast.setApresentador("Igor ");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }
        Favoritas favoritas = new Favoritas();
        favoritas.inclui(podcast);
        favoritas.inclui(musica);
    }
}
