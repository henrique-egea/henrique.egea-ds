import java.util.Scanner;

// Exercício 15
public class DescontoProgressivo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o preço do produto: ");
        float preco = Float.parseFloat(scanner.nextLine());
        
        float desconto;
        if (preco < 50) {
            desconto = 0.05f;
        } else if (preco <= 100) {
            desconto = 0.10f;
        } else {
            desconto = 0.15f;
        }
        
        float valorDesconto = preco * desconto;
        float precoFinal = preco - valorDesconto;
        
        System.out.println(String.format("Desconto (%.0f%%): R$ %.2f", desconto * 100, valorDesconto));
        System.out.println(String.format("Preço final: R$ %.2f", precoFinal));
    }
}
