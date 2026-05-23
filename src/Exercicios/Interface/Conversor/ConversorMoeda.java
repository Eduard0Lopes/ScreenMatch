package Exercicios.Interface.Conversor;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.00;
        double valorReais = cotacaoDolar * valorDolar;
        System.out.println("Reais em conversao direta: R$" + valorReais);
    }
}

