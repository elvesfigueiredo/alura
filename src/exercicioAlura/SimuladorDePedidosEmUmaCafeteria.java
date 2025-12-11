package exercicioAlura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    int quantidadeItem;
    String nome;
    double preco;

    public Produto(int quantidadeItem, String nome, double preco) {
        this.quantidadeItem = quantidadeItem;
        this.nome = nome;
        this.preco = preco;
    }

    public double getTotal() {
        return preco * quantidadeItem;
    }
}

public class SimuladorDePedidosEmUmaCafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("            LumosCoffe - Cafeteria e Doceria");
        System.out.println("=======================================================");
        System.out.println("CAIXA DE DIÁLOGO");
        System.out.println("Digite os pedidos (ou 'sair' para finalizar):");

        List<Produto> produtos = registrarPedidos(scanner);

        // Calcular total
        double total = 0;
        for (Produto p : produtos) {
            total += p.getTotal();
        }
        System.out.println("Total a pagar: R$ " + total);
    }

    public static List<Produto> registrarPedidos(Scanner scanner) {
        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("Nome do produto (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break; // encerra o loop
            }

            System.out.println("Preço do produto:");
            double preco = scanner.nextDouble();

            System.out.println("Quantidade:");
            int qtd = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            produtos.add(new Produto(qtd, nome, preco));
        }

        return produtos;
    }
}