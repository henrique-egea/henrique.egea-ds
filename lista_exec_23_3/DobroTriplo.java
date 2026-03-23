import java.util.Scanner;

// Exercício 1
public class DobroTriplo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int num = Integer.parseInt(scanner.nextLine());
        
        int dobro = num * 2;
        int triplo = num * 3;
        
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);
    }
}
