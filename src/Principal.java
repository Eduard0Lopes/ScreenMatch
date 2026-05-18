public class Principal {
    public static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1973;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.exibeFicha();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.obtemMedia());
    }
}
