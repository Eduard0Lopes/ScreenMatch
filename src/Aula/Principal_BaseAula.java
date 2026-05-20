package Aula;

import br.com.alura.screenmatch.Aula.modelos.Filme_BaseAula;

public class Principal_BaseAula {
    public static void main() {
        Filme_BaseAula meuFilmeBaseAula = new Filme_BaseAula();
        meuFilmeBaseAula.setNome("O Poderoso Chefão");
        meuFilmeBaseAula.setAnoLancamento(1973);
        meuFilmeBaseAula.setDuracaoEmMinutos(180);


        meuFilmeBaseAula.exibeFicha();
        meuFilmeBaseAula.avalia(8);
        meuFilmeBaseAula.avalia(5);
        meuFilmeBaseAula.avalia(10);
        System.out.println(meuFilmeBaseAula.getTotalAvaliacao());
        System.out.println(meuFilmeBaseAula.obtemMedia());
    }
}
