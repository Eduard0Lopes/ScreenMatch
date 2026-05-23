package Exercicios.Interface.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemp{

    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9/5) + 32;
    }

    @Override
    public double FahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
