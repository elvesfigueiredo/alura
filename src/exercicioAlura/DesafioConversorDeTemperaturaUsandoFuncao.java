package exercicioAlura;
import java.util.Scanner;

public class DesafioConversorDeTemperaturaUsandoFuncao {
    // Função para converter Celsius para Fahrenheit
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exibir título
        System.out.println("===============================");
        System.out.println("Conversor de Temperaturas");
        System.out.println("===============================");
        // Solicita ao usuário uma temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        // Agora converte Celsius para Fahrenheit
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        // Exibe o resultado
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "ºF");
    }
}
