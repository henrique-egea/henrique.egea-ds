import java.util.Scanner;

// Exercício 3
public class MediaPonderada {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota: ");
        float nota1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o peso da primeira nota: ");
        int peso1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Insira a segunda nota: ");
        float nota2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o peso da segunda nota: ");
        int peso2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Insira a terceira nota: ");
        float nota3 = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o peso da terceira nota: ");
        int peso3 = Integer.parseInt(scanner.nextLine());
        
        float mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.println(String.format("Média ponderada: %.2f", mediaPonderada));
    }
}
