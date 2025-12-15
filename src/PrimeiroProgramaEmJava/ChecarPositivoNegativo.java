package PrimeiroProgramaEmJava;

import java.util.Scanner;

public class ChecarPositivoNegativo {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um número");
        numero = digite.nextInt();
        if (numero > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
