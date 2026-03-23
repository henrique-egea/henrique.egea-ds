import java.util.Scanner;

// Exercício 10
public class DiferencaAbsoluta {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número inteiro: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o segundo número inteiro: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        
        int diferenca = Math.abs(num1 - num2);
        
        System.out.println("Diferença absoluta: " + diferenca);
    }
}
