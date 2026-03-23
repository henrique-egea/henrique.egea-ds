import java.util.Scanner;

// Exercício 16
public class VerificadorFaixa {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = Integer.parseInt(scanner.nextLine());
        
        if (num >= 10 && num <= 50) {
            System.out.println("O número está no intervalo [10, 50]");
        } else {
            System.out.println("O número NÃO está no intervalo [10, 50]");
        }
    }
}
