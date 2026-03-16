import java.util.Scanner;

// Exercício 6
public class IdadeVotar {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        
        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade >= 16 && idade < 18 || idade >= 70) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}
