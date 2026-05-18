package exercicio_1_metodos;

public class Principal {
    public static void main() {
        Filme filme = new Filme();
        filme.nome = "Zootopia";
        filme.anoFilme = 2026;
        filme.mostraFicha();
        filme.notaFilme(8);
        filme.notaFilme(7);
        filme.notaFilme(5);
        System.out.println(filme.totalAvaliacao);
        System.out.println(filme.mediaAvalicao());
    }
}
