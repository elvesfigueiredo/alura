package exercicioAlura;/*
Você está desenvolvendo o sistema de bilheteria para um cinema. Os clientes podem ter direito a meia-entrada em duas situações:
Se tiverem menos de 18 anos ou se forem estudantes
Sua tarefa é criar um algoritmo em linguagem natural ou gráfica (usando fluxogramas, por exemplo)
 que avalie as informações do cliente e exiba uma mensagem indicando se ele tem ou não direito ao desconto.
*/
public class DesafioVerificacaoDeDesconto {
    public static void main(String[] args) {
        // Definindo idade do cliente e se ele é estudante
        int idadeDoCliente = 20;
        boolean carteiraDeEstudante = true;
        // Verificar se o cliente tem direito a meia-entrada no cinema
        if (idadeDoCliente < 18 || carteiraDeEstudante) {
            System.out.println("Tem direito a meia entrada no cinema");
        } else {
            System.out.println("Não tem direito a meia entrada no cinema");
        }
    }
}
