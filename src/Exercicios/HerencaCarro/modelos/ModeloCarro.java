package Exercicios.HerencaCarro.modelos;

public class ModeloCarro{
    static void main() {
    Carro c1 = new Carro();
    c1.definirModelo("Mustang");
    c1.definirPrecos(80000, 50000, 90000);
    c1.exibirInfo();
    }
}
