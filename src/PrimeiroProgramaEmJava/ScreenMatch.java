package PrimeiroProgramaEmJava;

public class ScreenMatch {
    public static void main(String[] args) {
        System.out.println("This is Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do Filme: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80\n";
        System.out.println("Sinopse: " + sinopse);
        System.out.println("""
                Teste de Implementação:\nRecurso TextBlocks (aspas triplas) que foi implementado no Java15
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """+ anoDeLancamento);
    }
}
