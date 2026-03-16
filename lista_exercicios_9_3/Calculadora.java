import java.util.Scanner;

// Exercício 12
public class Calculadora {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Insira o segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Insira o operador (+, -, *, /): ");
        String operador = scanner.nextLine();
        
        double resultado;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido");
                return;
        }
        
        System.out.println(String.format("Resultado: %.2f", resultado));
    }
}
