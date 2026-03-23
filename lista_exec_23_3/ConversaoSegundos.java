import java.util.Scanner;

// Exercício 18
public class ConversaoSegundos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de segundos: ");
        int totalSegundos = Integer.parseInt(scanner.nextLine());
        
        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}
