package PrimeiroProgramaEmJava;

import java.util.Scanner;

// Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando
// se são iguais ou diferentes. o primeiro é maior ou o segundo é maior.
public class CompararNumerosInteiros {
    public static void main(String[] args) {
        Scanner compare = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Digite um número");
        n1 = compare.nextInt();
        System.out.println("Digite outro número");
        n2 = compare.nextInt();
        if (n1 == n2) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
            if (n1 > n2) {
                System.out.println("O primeiro número é maior que o segundo pois " + n1 + " é " + "maior que " + n2);
            } else {
                System.out.println("O segundo número é maior que o primeiro pois " + n2 + " é " + "maior que " + n1);
            }
            compare.close();
        }
    }
}