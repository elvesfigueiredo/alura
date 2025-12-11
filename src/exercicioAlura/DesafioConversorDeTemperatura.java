package exercicioAlura;

import java.util.Scanner;

public class DesafioConversorDeTemperatura {
    public static void main(String[] args) {
        // Cria um objeto scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Exibe uma mensagem inicial para o usuário
        System.out.println("==========================================");
        System.out.println("Conversor de Temperatura");
        System.out.println("==========================================");
        // Declara a variável para armazenar a temperatura em Celsius
        int temperaturaCelsius;
        // Inicia um loop que só será quebrado quando a entrada for válida
        while (true){
            System.out.println("Digite a temperatura: "); // Solicita ao usuário que digite a temperatura
            if (scanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
                temperaturaCelsius = scanner.nextInt();  // Atribui o valor da temperaturaCelsius a partir da entrada do usuário
                if (temperaturaCelsius >= 0) { // Verifica se a temperatura é válida (não negativa)
                    int fahrenheit = temperaturaCelsius * 9 / 5 + 32; // Realiza a conversão de Celsius para Fahrenheit
                    System.out.println("Temperatura em fahrenheit: " + fahrenheit + "ºF"); // Exibe a temperatura convertida para Fahrenheit
                    break; // Sai do loop pois a entrada foi válida e a conversão foi feita
                } else {
                    System.out.println("O valor deve ser um número positivo."); // Caso a temperatura seja negativa, informa o erro
                }
            } else {
                // Caso a entrada não seja um número inteiro, informa o erro
                System.out.println("Entrada inválida, insira um número inteiro...");
                // Limpa o scanner para que ele possa processar a próxima entrada corretamente
                scanner.next();  // Consome a entrada inválida
            }
        }
        // Fecha o scanner após a execução.
        scanner.close();
    }
}
