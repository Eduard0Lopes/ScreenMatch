package Exercicios.Interface.ConversorTemperatura;

public class Principal {
    static void main() {
        double temperaturaCelcius = 0;
        double temperaturaFahrenheit = 0;
        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        System.out.println("A temperatura de " + temperaturaCelcius + "°C em fahrenheit é: " + conversorTemp.celsiusParaFahrenheit(temperaturaCelcius));
        System.out.println("A temperatura de " + temperaturaFahrenheit + "°F em celcius é: " + conversorTemp.FahrenheitParaCelsius(temperaturaFahrenheit));
    }
}
