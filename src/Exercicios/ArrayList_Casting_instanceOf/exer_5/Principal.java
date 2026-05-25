package Exercicios.ArrayList_Casting_instanceOf.exer_5;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        var circulo = new Circulo();
        var quadrado = new Quadrado();

        circulo.raio = 5;
        quadrado.lado = 2;

        ArrayList<Forma> listaObjetos = new ArrayList<>();

        listaObjetos.add(circulo);
        listaObjetos.add(quadrado);

        for (Forma forma : listaObjetos) {
            System.out.println("Area de " + forma.calcularArea());
        }
    }
}
