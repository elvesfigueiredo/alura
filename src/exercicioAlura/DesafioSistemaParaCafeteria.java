package exercicioAlura;

import java.util.Scanner;

public class DesafioSistemaParaCafeteria {
    public static void main(String[] args) {
        // Exibe cabeçalho da cafeteria
        System.out.println("=======================================================");
        System.out.println("            LumosCoffe - Cafeteria e Doceria");
        System.out.println("=======================================================");
        // Cria objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);
        // Pergunta quantos itens o cliente solicitou
        System.out.println("Quantos itens o cliente solicitou?");
        int qtdItens = scanner.nextInt(); // Lê número inteiro
        scanner.nextLine(); // Consome quebra de linha pendente
        // Variável acumuladora para o valor total da compra
        double total = 0;
        // Loop para coletar nome e preço de cada item
        for (int i = 1; i <= qtdItens; i++) {
            // Solicita nome do produto
            System.out.println("Informe o nome do " + i + "º produto...");
            String nome = scanner.nextLine();
            double preco = 0;
            // Loop de validação para garantir que o preço seja um número válido
            while(true) {
                System.out.println("Preço do "+ nome + ": R$ ");
                if (scanner.hasNextDouble()) { // Verifica se entrada é número
                    preco = scanner.nextDouble(); // Lê preço
                    scanner.nextLine(); // Consome quebra de linha
                    break; // Sai do loop de validação
                } else {
                    // Caso entrada inválida, pede novamente
                    System.out.println("Por favor digite um preço válido...");
                    scanner.next(); // Descarta entrada inválida
                }
            }
            // Soma preço ao total
            total += preco;
        }
        // Variável para armazenar total final (com ou sem desconto)
        double totalFinal;
        // Pergunta se cliente é cadastrado
        System.out.println("O cliente é cadastrado? (sim/não)");
        String resposta = scanner.nextLine();
        // Se cliente for cadastrado, aplica desconto de 10%
        if (resposta.equals("sim")) {
            double desconto = total * 0.10; // Calcula desconto
            totalFinal = total - desconto; // Aplica desconto
            // Exibe valores formatados
            System.out.printf("Total da compra: R$ %.2f \nDesconto de 10%% aplicado!\nTotal com desconto: R$ %.2f\n", total, totalFinal);
        } else {
            // Caso não seja cadastrado, mantém total original
            totalFinal = total;
            System.out.printf("Total sem desconto: R$ %.2f\n", totalFinal);
        }
    }
}