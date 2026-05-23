package Exercicios.Interface.CalcularPrecoFim;


public class Principal {
    static void main() {
        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();

        System.out.println("Preço do produto com taxas " + produto.calcularPrecoFinal(5));
        System.out.println("Preço do livro com desconto " + livro.calcularPrecoFinal(10));
    }
}
