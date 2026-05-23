package Exercicios.exerciciosScreenMatch.exercicioProdutos;

public class Produtos {
    private String nomeProduto;
    private double precoProduto;

    public Produtos(String nomeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void aplicaDesconto(double percentual) {
        double desconto = precoProduto * (percentual / 100);
        precoProduto -= desconto;
    }
}
