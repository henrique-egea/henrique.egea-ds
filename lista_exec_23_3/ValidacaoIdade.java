import java.util.Scanner;

// Exercício 5
public class ValidacaoIdade {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
