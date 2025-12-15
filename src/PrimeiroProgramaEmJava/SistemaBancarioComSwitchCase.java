package PrimeiroProgramaEmJava;

import java.util.Scanner;

public class SistemaBancarioComSwitchCase {
    public static void main(String[] args) {
        String nome = "Elves Figueiredo";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 1000;
        String login;
        String senha;
        // Tela de Login
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Digite seu login");
        login = scanner.nextLine();
        System.out.println("Digite sua senha");
        senha = scanner.nextLine();
        if (login.equals("figueiredo") && senha.equals("1234")) {
            System.out.println("Acesso Autorizado");
            // Dados iniciais
            System.out.println("==========================");
            System.out.println("Dados iniciais do cliente");
            System.out.printf("""
                Nome: %s
                Tipo de Conta: %s
                Saldo da Conta: %.2f
                """, nome, tipoDeConta, saldoDaConta);
        } else {
            System.out.println("Login ou senha invalido");
            return;
        }

        System.out.println("==========================\n");

        String menu = """
                1. Consultar saldo da conta
                2. Receber valor
                3. Transferir valor
                4. Sair
                Digite a operação desejada: """;

        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("O saldo da conta atual é: R$%.2f\n", saldoDaConta);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja receber:");
                    double recebeTransferencia = ler.nextDouble();
                    saldoDaConta += recebeTransferencia;
                    System.out.printf("Você recebeu: R$%.2f\n", recebeTransferencia);
                    System.out.printf("O saldo atualizado é: R$%.2f\n", saldoDaConta);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir:");
                    double fazTransferencia = ler.nextDouble();
                    if (fazTransferencia <= saldoDaConta) {
                        saldoDaConta -= fazTransferencia;
                        System.out.printf("Você transferiu: R$%.2f\n", fazTransferencia);
                        System.out.printf("Seu saldo atualizado é: R$%.2f\n", saldoDaConta);
                    } else {
                        System.out.printf("Saldo insuficiente! Seu saldo atual é: R$%.2f\n", saldoDaConta);
                    }
                    break;

                case 4:
                    System.out.println("Você escolheu sair, até logo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        ler.close();
    }
}