import java.util.Scanner;

// Exercício 9
public class Multiplos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        
        if (num1 % num2 == 0) {
            System.out.println("O primeiro é múltiplo do segundo");
        } else {
            System.out.println("O primeiro não é múltiplo do segundo");
        }
    }
}
