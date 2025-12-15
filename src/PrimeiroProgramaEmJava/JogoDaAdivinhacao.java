package PrimeiroProgramaEmJava;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int tentativa = 0;

        while (tentativa < 7) {
            System.out.println("Digite um numero entre 0 e 100 ");
            numeroDigitado = leitura.nextInt();
            tentativa++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número digitado em " + tentativa + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }
        if (tentativa == 7 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 07 tentativas. O número era: " + numeroGerado);
        }
    }
}