import java.util.Scanner;

// Exercício 13
public class ClassificacaoNota {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a nota (0 a 10): ");
        double nota = Double.parseDouble(scanner.nextLine());
        
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else {
            System.out.println("Nota válida");
        }
    }
}
