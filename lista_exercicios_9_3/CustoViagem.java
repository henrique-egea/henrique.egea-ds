import java.util.Scanner;

// Exercício 14
public class CustoViagem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a distância (km): ");
        double distancia = Double.parseDouble(scanner.nextLine());
        System.out.println("Insira o consumo do carro (km/L): ");
        double consumo = Double.parseDouble(scanner.nextLine());
        
        double litros = distancia / consumo;
        System.out.println(String.format("Litros necessários: %.2f L", litros));
    }
}
