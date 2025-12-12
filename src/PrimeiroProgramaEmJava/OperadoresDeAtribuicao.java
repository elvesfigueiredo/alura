package PrimeiroProgramaEmJava;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int valor = 5; // Atribui o valor 5 à variável valor
        int valor1 = 10;
        valor1 += 15; // Equivalente a valor = valor + 15, atribui o valor 25 à variável.
        /*
        Operadores aritméticos:
Os operadores aritméticos são usados para realizar operações matemáticas básicas. São eles:
"+" (adição)
"-" (subtração)
"*" (multiplicação)
"/" (divisão)
"%" (resto da divisão)
         */
        int a1 = 10 + 5; // Atribui o valor 15 à variável a
        int b2 = 10 - 5; // Atribui o valor 5 à variável b
        int c3 = 10 * 5; // Atribui o valor 50 à variável c
        int d4 = 10 / 5; // Atribui o valor 2 à variável d
        int e5 = 10 % 3; // Atribui o valor 1 à variável e

        /*Os operadores relacionais são usados para comparar valores.
        Eles retornam um valor booleano (verdadeiro ou falso). Trabalharemos
        melhor com eles quando estivermos na aula de condicionais,
        onde vamos modificar o fluxo da aplicação dada alguma condição. São eles:
"==" (igual a)
"!=" (diferente de)
">" (maior que)
">=" (maior ou igual a)
"<" (menor que)
"<=" (menor ou igual a)*/
        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30, à variável c
        boolean igual = (b==a); // Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); // A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = ( b > a ); // A variavél maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menor = (b <= c ); // A variavél menorIgual ficará com o valor *true*, pois o valor b é menor que o valor de c.

        boolean aa = true;
        boolean bb = false;
        if (aa && bb) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }

        boolean aaa = true;
        boolean bbb = false;
        if(aaa || bbb) {
            // Este código vai ser executado, já que a é verdadeiro, mesmo que b seja falso.
        }
        boolean aaaa = true;
        if (!aaaa){
            // Este código não será executado, já que a é verdadeiro.
        }
    }
}
