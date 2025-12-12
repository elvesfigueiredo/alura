package PrimeiroProgramaEmJava;

public class CriacaoDeString {
    public static void main(String[] args) {
        // Para criar uma String em Java, basta utilizar aspas duplas para delimitar o texto. Por exemplo:
        // Nesse exemplo, a variável nome recebe uma String com o texto "Alura".
        // É possível concatenar duas ou mais Strings utilizando o operador +, por exemplo:
        String saudacao = "Olá, ";
        String nome = "Alura";
        String mensagem = saudacao + nome + "!";
        System.out.println(mensagem);

        String senha = "12345";
        if (senha.equals("123456")) {
            System.out.println("Acesso Autorizado!");
        } else {
            System.out.println("Senha incorreta!");
            /*
Nesse caso, o método equals() é utilizado para comparar o conteúdo da variável senha com a String "12345".
Se as duas Strings forem iguais, a mensagem "Acesso autorizado!" será impressa, caso contrário, a mensagem "Senha incorreta." será impressa.
Mais adiante trabalharemos também com o método equalsIgnoreCase(), que é usado para que a comparação de Strings desconsidere as letras maiúsculas e minúsculas.
Utilizando apenas o equals, as String “alura” e “Alura” seriam consideradas diferentes.
             */

            String mensagemTextBlock = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
            System.out.println(mensagemTextBlock);
        }
    }
}
