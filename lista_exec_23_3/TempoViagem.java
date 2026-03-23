import java.util.Scanner;

// Exercício 7
public class TempoViagem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a distância (km): ");
        float distancia = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira a velocidade média (km/h): ");
        float velocidade = Float.parseFloat(scanner.nextLine());
        
        float tempo = distancia / velocidade;
        
        System.out.println(String.format("Tempo estimado de viagem: %.2f horas", tempo));
    }
}
