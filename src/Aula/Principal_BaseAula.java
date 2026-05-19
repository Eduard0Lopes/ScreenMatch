package Aula;

public class Principal_BaseAula {
    public static void main() {
        Filme_BaseAula meuFilmeBaseAula = new Filme_BaseAula();
        meuFilmeBaseAula.nome = "O Poderoso Chefão";
        meuFilmeBaseAula.anoLancamento = 1973;
        meuFilmeBaseAula.duracaoEmMinutos = 180;
        meuFilmeBaseAula.exibeFicha();
        meuFilmeBaseAula.avalia(8);
        meuFilmeBaseAula.avalia(5);
        meuFilmeBaseAula.avalia(10);
        System.out.println(meuFilmeBaseAula.somaAvaliacao);
        System.out.println(meuFilmeBaseAula.totalAvaliacao);
        System.out.println(meuFilmeBaseAula.obtemMedia());
    }
}
