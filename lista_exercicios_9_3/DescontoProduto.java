import java.util.Scanner;

// Exercício 8
public class DescontoProduto {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do produto: ");
        double valor = Double.parseDouble(scanner.nextLine());
        
        if (valor > 100) {
            valor = valor * 0.80;
        } else {
            valor = valor * 0.90;
        }
        
        System.out.println(String.format("Valor final: %.2f", valor));
    }
}
