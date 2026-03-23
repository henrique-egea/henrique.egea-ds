import java.util.Scanner;

// Exercício 4
public class CustoFinalProduto {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o preço do produto: ");
        float preco = Float.parseFloat(scanner.nextLine());
        
        float impostoEstadual = preco * 0.05f;
        float impostoFederal = preco * 0.07f;
        float valorFinal = preco + impostoEstadual + impostoFederal;
        
        System.out.println(String.format("Preço original: R$ %.2f", preco));
        System.out.println(String.format("Imposto estadual (5%%): R$ %.2f", impostoEstadual));
        System.out.println(String.format("Imposto federal (7%%): R$ %.2f", impostoFederal));
        System.out.println(String.format("Valor final: R$ %.2f", valorFinal));
    }
}
