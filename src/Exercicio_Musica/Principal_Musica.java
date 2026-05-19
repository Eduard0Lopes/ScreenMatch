package Exercicio_Musica;

public class Principal_Musica {
    static void main() {
        Musica m1 = new Musica();

        m1.titulo = "Numb";

        m1.artista = "Linkin Park";

        m1.anoLancamento = 2003;

        m1.avaliaMusica(10);

        m1.avaliaMusica(9);

        m1.mediaMusica();

        m1.mostraFicha();

    }
}
