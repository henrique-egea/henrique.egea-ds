import java.util.Scanner;

// Exercício 10
public class PesoIdeal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a altura (em metros): ");
        double altura = Double.parseDouble(scanner.nextLine());
        System.out.println("Insira o sexo (M/F): ");
        String sexo = scanner.nextLine().toUpperCase();
        
        double pesoIdeal;
        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        
        System.out.println(String.format("Peso ideal: %.2f kg", pesoIdeal));
    }
}
