package Exercicio2_Produtos;

import br.com.alura.screenmatch.exercicioProdutos.Produtos;

public class Principal {
    static void main() {
        Produtos p1 = new Produtos("Detergente", 10);
        Produtos p2 = new Produtos("Quest 3", 3500);

        System.out.println("====== PRATELEIRA ======");
        System.out.println(p1.getNomeProduto() + " Por apenas: R$ " + p1.getPrecoProduto());
        System.out.println(p2.getNomeProduto() + " Por apenas: R$ " + p2.getPrecoProduto());
        p1.aplicaDesconto(50);
        p2.aplicaDesconto(50);
        System.out.println("DESCONTOS APLICADOS!");
        System.out.println(p1.getNomeProduto() + " Por apenas: R$ " + p1.getPrecoProduto());
        System.out.println(p2.getNomeProduto() + " Por apenas: R$ " + p2.getPrecoProduto());

    }

}
