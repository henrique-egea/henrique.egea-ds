import java.util.Scanner;

// Exercício 13
public class CategoriaIMC {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o peso (kg): ");
        float peso = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira a altura (m): ");
        float altura = Float.parseFloat(scanner.nextLine());
        
        float imc = peso / (altura * altura);
        
        System.out.println(String.format("IMC: %.2f", imc));
        
        if (imc < 18.5f) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 25) {
            System.out.println("Peso normal");
        } else {
            System.out.println("Acima do peso");
        }
    }
}
