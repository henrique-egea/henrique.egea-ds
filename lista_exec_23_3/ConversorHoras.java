import java.util.Scanner;

// Exercício 2
public class ConversorHoras {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de horas: ");
        int horas = Integer.parseInt(scanner.nextLine());
        
        int minutos = horas * 60;
        
        System.out.println(horas + " horas equivalem a " + minutos + " minutos");
    }
}
