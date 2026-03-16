import java.util.Scanner;

// Exercício 18
public class ConsumoEnergia {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o consumo em kWh: ");
        double kwh = Double.parseDouble(scanner.nextLine());
        
        double valor;
        if (kwh < 100) {
            valor = kwh * 0.20;
        } else {
            valor = kwh * 0.25;
        }
        
        System.out.println(String.format("Valor a pagar: R$ %.2f", valor));
    }
}
