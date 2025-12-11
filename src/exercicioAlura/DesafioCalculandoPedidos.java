package exercicioAlura;
//Você está desenvolvendo uma funcionalidade para um aplicativo de lanchonete.
// O sistema precisa calcular o valor total de um pedido com base na quantidade de itens solicitados.
//O cliente pode pedir:
//Hambúrguer: R$ 12,00
//Batata frita: R$ 7,00
//Refrigerante: R$ 5,00
//Sua tarefa é criar um algoritmo em linguagem natural ou fluxograma que armazene os dados necessários em variáveis
// e faça o cálculo do valor total com base nas quantidades informadas.
public class DesafioCalculandoPedidos {
    public static void main(String[] args) {
        // Definindo o preço das variáveis com o tipo 'double' para maior precisão
        double precoHamburguer = 12.0;
        double precoBatata_Frita = 7.0;
        double precoRefri = 5.0;
        // Definindo a quantidade de itens solicitados
        int qtdHamburguer = 3;
        int qtdBatata_Frita = 3;
        int qtdRefri = 3;
        // Definindo as Strings com os nomes dos itens
        String hamburguer = "Hambúrguer";
        String batata_frita = "Batata frita";
        String refri = "Refrigerante";

        // Calculando o total
        double total = (precoHamburguer * qtdHamburguer) + (precoBatata_Frita * qtdBatata_Frita) + (precoRefri * qtdRefri);
        // Exibindo os itens, as quantidades, os preços unitários e os totais de cada item
        System.out.println("=============================================================================");
        System.out.printf("Seu pedido:\n");
        System.out.printf("%d %s(s) no valor de R$ %.2f cada, totalizando R$ %.2f.\n",
                qtdHamburguer, hamburguer, precoHamburguer, precoHamburguer * qtdHamburguer);
        System.out.printf("%d %s(s) de R$ %.2f cada, totalizando R$ %.2f.\n",
                qtdBatata_Frita, batata_frita, precoBatata_Frita, precoBatata_Frita * qtdBatata_Frita);
        System.out.printf("%d %s(s) no valor de R$ %.2f cada, totalizando R$ %.2f.\n",
                qtdRefri, refri, precoRefri, precoRefri * qtdRefri);
        // Exibindo o total geral do pedido
        System.out.printf("=============================================================================\n");
        System.out.printf("Total de pedidos: R$ %.2f\n", total);
    }
}