package exercicioAlura;
import java.util.Scanner;
/*Você está desenvolvendo um sistema para uma empresa de delivery.
O valor da taxa de entrega depende da distância até o cliente e se o pedido foi feito em um dia de chuva.
As regras são:
Para entregas até 5 km, a taxa é R$ 5,00.
Entre 5 e 10 km, a taxa é R$ 8,00.
Acima de 10 km, a taxa é R$ 10,00.
Se estiver chovendo, acrescenta R$ 2,00 à taxa padrão.
O desafio desta atividade é criar um algoritmo em linguagem natural que informe o valor final da entrega.
*/
public class DesafioCalculandoValorDaEntrega {
    public static void main(String[] args) {
        // perguntar ao cliente a distancia
        Scanner sc = new Scanner(System.in);
        // definir as variaveis para saber a distancia e se esta chovendo
        int distancia;
        boolean chuva;
        // Loop para garantir que o valor informado seja válido
        while (true) {
            System.out.println("Digite a distancia em km ");
            if (sc.hasNextInt()) {
                distancia = sc.nextInt();
                sc.nextLine();
                if (distancia >= 0) {
                    break;
                } else {
                    System.out.println("Distância não pode ser negativa! Tente novamente.");
                }
            } else {
                System.out.println("Distância inválida! Por favor, digite um valor numérico.");
                sc.nextLine(); // Limpar o buffer de entrada
            }
        }
        // Loop para garantir que a resposta sobre chuva seja válida
        while (true) {
            System.out.println("Está chovendo? true/false");
            if (sc.hasNextBoolean()) {
                chuva = sc.nextBoolean();
                sc.nextLine();
                break;
            } else {
                System.out.println("Resposta invalida, digite true ou false.");
                sc.nextLine();
            }
        }
        // Definindo as taxas de entrega
        double taxaDeEntrega = 0.0;
        // Lógica para calcular a taxa de entrega de acordo com a distancia
        if (distancia <= 5) {
            taxaDeEntrega = 5.00;
        } else if (distancia <= 10) {
            taxaDeEntrega = 8.00;
        } else {
            taxaDeEntrega = 10.00;
        }
        if (chuva) {
            taxaDeEntrega += 2.0;
        }
        // Exibe o valor final da taxa de entrega
        System.out.printf("O valor da taxa de entrega é de R$ %.2f%n", taxaDeEntrega);
        // Fechar o scanner após o uso
        sc.close();
    }
}