import java.util.Scanner;

// Exercício 17
public class SomaPositivos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        
        if (num1 > 0 && num2 > 0) {
            int soma = num1 + num2;
            System.out.println("Soma: " + soma);
        } else {
            System.out.println("Valores inválidos");
        }
    }
}
