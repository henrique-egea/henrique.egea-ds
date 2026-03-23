import java.util.Scanner;

// Exercício 14
public class AprovacaoNota {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota: ");
        float nota1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira a segunda nota: ");
        float nota2 = Float.parseFloat(scanner.nextLine());
        
        float media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Média: %.2f", media));
        
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
