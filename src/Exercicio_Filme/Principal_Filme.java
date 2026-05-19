package Exercicio_Filme;

public class Principal_Filme {

    public static void main() {
    Filme flm = new Filme();
    flm.nome = "Dengo";
    flm.anoLancamento = 2022;
    flm.totalNota(10);
    flm.totalNota(0);
    flm.totalNota(1);
    flm.mediaAvaliacao();
    flm.mostraFicha();
    }
}
