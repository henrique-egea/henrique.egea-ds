import java.util.Scanner;

// Exercício 17
public class Aprovacao {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a nota (0 a 10): ");
        double nota = Double.parseDouble(scanner.nextLine());
        System.out.println("Insira a frequência (%): ");
        double frequencia = Double.parseDouble(scanner.nextLine());
        
        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
