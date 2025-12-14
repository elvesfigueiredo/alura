package PrimeiroProgramaEmJava;

import java.util.Locale;
import java.util.Scanner;

// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
public class CalculadoraAreaGeometrica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha = 0;
        do {
            System.out.println("======================");
            System.out.println("Calculadora de Area Geometrica");
            System.out.println("======================");
            System.out.println("MENU");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do circulo");
            System.out.println("0. Sair");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    int lado = 0;

                    System.out.println("Digite o lado do quadrado");
                    lado = ler.nextInt();
                    int areaDoQuadrado = (lado * lado);
                    System.out.println("Area do quadrado: "+ areaDoQuadrado+"m²");
                    return;

                case 2:
                    double raioDoCirculo = 0;
                    System.out.println("Insira o raio para calcular a area do Circulo");
                    raioDoCirculo = ler.nextDouble();
                    double areaDoCirculo = Math.PI * (raioDoCirculo * raioDoCirculo);
                    System.out.printf("O valor do Circulo é: %.2fcm² ", areaDoCirculo);
                    return;

                case 0:
                    System.out.println("Até logo...");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        } while (escolha != 0) ;
        ler.close();
    }
}