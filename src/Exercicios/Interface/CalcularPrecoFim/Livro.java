package Exercicios.Interface.CalcularPrecoFim;

public class Livro implements Calculavel {
    String autor;
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9;
    }
}
