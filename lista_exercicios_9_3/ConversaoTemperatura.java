import java.util.Scanner;

// Exercício 7
public class ConversaoTemperatura {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius: ");
        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println(String.format("Temperatura em Fahrenheit: %.2f", fahrenheit));
    }
}
