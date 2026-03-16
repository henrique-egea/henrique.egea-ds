import java.util.Scanner;

// Exercício 20
public class Triangulo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro lado: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o segundo lado: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o terceiro lado: ");
        int c = Integer.parseInt(scanner.nextLine());
        
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Não forma triângulo");
        } else if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
