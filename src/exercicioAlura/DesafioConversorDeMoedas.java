package exercicioAlura;
/*
Você está desenvolvendo um sistema de apoio para uma agência de viagens.
Uma das funcionalidades mais solicitadas é um conversor de moedas. O usuário informa um valor em reais (R$)
e o sistema precisa mostrar quanto isso representa em dólares (US$), usando uma taxa de câmbio definida pela empresa.
Sua tarefa é criar um algoritmo em linguagem natural que use uma função para fazer essa conversão.
A função deve receber o valor em reais e a taxa de câmbio como entrada, e retornar o valor convertido.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DesafioConversorDeMoedas {
    // Cria a função do conversor de reais para dolar
    public static double converterParaDolar (double valorEmReais, double taxaDeCambio){
        return (valorEmReais / taxaDeCambio);
    }
    // Pergunta o valor em reais
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Permite ao usuário digitar
        System.out.println("================================");
        System.out.println("Conversor de Moedas");
        System.out.println("==============================");
        // Solicita ao usuário um valor
        System.out.println("Digite o valor em R$: ");
        double valorEmReais = scanner.nextDouble();
        System.out.println("Qual a taxa do cambio? ");
        double taxa = scanner.nextDouble();
        // Chama a função de conversão e exibe o resultado
        double valorConvertido = converterParaDolar(valorEmReais, taxa);
        System.out.printf("Valor convertido em US$: %.2f\n", valorConvertido); // Exibe o valor em dólares
    scanner.close();
    }
}
