package Exercicios.ArrayList_Casting_instanceOf.exer_5;

public class Circulo implements Forma{
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
