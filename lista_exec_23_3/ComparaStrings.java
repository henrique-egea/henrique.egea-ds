import java.util.Scanner;

// Exercício 19
public class ComparaStrings {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.println("Insira a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        System.out.println("Insira a terceira palavra: ");
        String palavra3 = scanner.nextLine();
        
        int tam1 = palavra1.length();
        int tam2 = palavra2.length();
        int tam3 = palavra3.length();
        
        String maiorPalavra;
        int maiorTamanho;
        
        if (tam1 >= tam2 && tam1 >= tam3) {
            maiorPalavra = palavra1;
            maiorTamanho = tam1;
        } else if (tam2 >= tam1 && tam2 >= tam3) {
            maiorPalavra = palavra2;
            maiorTamanho = tam2;
        } else {
            maiorPalavra = palavra3;
            maiorTamanho = tam3;
        }
        
        System.out.println("A maior palavra é \"" + maiorPalavra + "\" com " + maiorTamanho + " letras");
    }
}
