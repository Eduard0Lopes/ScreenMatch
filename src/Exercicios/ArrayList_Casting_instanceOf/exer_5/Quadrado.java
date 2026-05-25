package Exercicios.ArrayList_Casting_instanceOf.exer_5;

public class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
