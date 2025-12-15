package PrimeiroProgramaEmJava;

import java.util.Scanner;
// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
public class ExibirTabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tabuada = 0;
        System.out.println("Digite um número e iremos mostrar a tabuada de 1 a 10.");
        tabuada = ler.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.printf("Tabuada de %d*%d = %d\n", tabuada, i, (tabuada * i));
        }
    }
}
