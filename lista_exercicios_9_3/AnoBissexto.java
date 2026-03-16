import java.util.Scanner;

// Exercício 11
public class AnoBissexto {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        if (bissexto) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}
