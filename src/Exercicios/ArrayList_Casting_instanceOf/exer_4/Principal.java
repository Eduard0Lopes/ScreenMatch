package Exercicios.ArrayList_Casting_instanceOf.exer_4;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
    var p1 = new Produto("Monster", 10);
    var p2 = new Produto("Red Bull", 12.05);
    var p3 = new Produto("Bally", 8.59);

    ArrayList<Produto> listaCompras = new ArrayList<>();
    listaCompras.add(p1);
    listaCompras.add(p2);
    listaCompras.add(p3);

    double somaTotal = 0;

    for (Produto produto : listaCompras) {
        somaTotal += produto.getPrecoProd();
    }

    double mediaPreco = somaTotal / listaCompras.size();
        System.out.println(mediaPreco);
    }
}
