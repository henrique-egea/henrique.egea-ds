import java.util.Scanner;

// Exercício 6
public class ParidadeDivisibilidade {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = Integer.parseInt(scanner.nextLine());
        
        String paridade = (num % 2 == 0) ? "Par" : "Ímpar";
        String divisivelPor5 = (num % 5 == 0) ? "Divisível por 5" : "Não divisível por 5";
        
        System.out.println(paridade);
        System.out.println(divisivelPor5);
    }
}
