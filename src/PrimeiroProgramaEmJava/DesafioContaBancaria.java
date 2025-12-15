package PrimeiroProgramaEmJava;

import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome = "Elves Figueiredo";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 1000;

        // Criando operações
        System.out.println("==========================");
        System.out.println("Dados iniciais do cliente");
        System.out.printf("""
                Nome: %s
                Tipo de Conta: %s
                Saldo da Conta: %.2f
                """, nome, tipoDeConta, saldoDaConta);
        System.out.println("==========================\n");
        String menu = ("""
                1. Consulta saldo da conta
                2. Receber valor
                3. Transferir valor
                4. Sair
                Digite a operação desejada:\s""");

        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.printf("O saldo da conta atual é: R$%.2f\n", saldoDaConta);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja receber");
                double recebeTransferencia = ler.nextDouble();
                saldoDaConta += recebeTransferencia;
                System.out.printf("Você recebeu: R$%.2f\n", recebeTransferencia);
                System.out.printf("O saldo atualizado é: R$ %.2f\n", saldoDaConta);
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir");
                double fazTransferencia = ler.nextDouble();
                if (fazTransferencia <= saldoDaConta) {
                    saldoDaConta -= fazTransferencia;
                    System.out.printf("Você transferiu: R$%.2f\n", fazTransferencia);
                    System.out.printf("Seu saldo atualizado é: R$%.2f\n", saldoDaConta);
                } else {
                    System.out.printf("Saldo insuficiente, seu saldo atual é: R$%.2f\n", saldoDaConta);
                }
            } else if (opcao == 4) {
                System.out.println("Você escolheu sair, até logo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}