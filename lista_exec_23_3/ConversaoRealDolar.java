import java.util.Scanner;

// Exercício 12
public class ConversaoRealDolar {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o valor em reais: ");
        float reais = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira a cotação do dólar: ");
        float cotacao = Float.parseFloat(scanner.nextLine());
        
        float dolares = reais / cotacao;
        
        System.out.println(String.format("R$ %.2f equivalem a US$ %.2f", reais, dolares));
    }
}
