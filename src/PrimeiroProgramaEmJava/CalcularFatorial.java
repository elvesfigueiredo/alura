package PrimeiroProgramaEmJava;

import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = input.nextInt();
        if (numero < 0){
            System.out.println("Não existe número fatorial negativo.");
            return;
        }

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);
    }
}
