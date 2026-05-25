package Exercicios.Construtores;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        var perecivel = new ProdutoPerecivel("Leite", 5, 1, " 02-11-2026");
        var produto1 = new Produto ("Snickers", 6.98, 2);
        var produto2 = new Produto("Monster Mango Loko", 9.87, 1);
        var produto3 = new Produto("Gasolina Aditivada", 6.31, 23);


        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(perecivel);

        System.out.println("Quantidade de itens no carrinho " + listaProdutos.size());
        System.out.println("Itens do carrinho: " + listaProdutos);
        System.out.println("Primeiro item da lista " + listaProdutos.get(0));
    }
}
