import java.util.Scanner;

// Exercício 19
public class MenorTres {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o terceiro número: ");
        int num3 = Integer.parseInt(scanner.nextLine());
        
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        
        System.out.println("O menor número é: " + menor);
    }
}
