package PrimeiroProgramaEmJava;

import java.util.Locale;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
        double temperaturaCelsius = 26;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

    String mensagem = String.format(Locale.US,"A temperatura de %.2fºC Celsius é equivalente a %.2fºF Fahrenheit!", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);
    }
}
