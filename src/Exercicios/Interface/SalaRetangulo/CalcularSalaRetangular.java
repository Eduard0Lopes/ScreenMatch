package Exercicios.Interface.SalaRetangulo;

public class CalcularSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = largura * altura;
        System.out.println("A área é de: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (largura + altura);
        System.out.println("O perimetro é de " + perimetro);
    }
}
