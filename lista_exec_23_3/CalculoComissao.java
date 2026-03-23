import java.util.Scanner;

// Exercício 20
public class CalculoComissao {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da venda: ");
        float venda = Float.parseFloat(scanner.nextLine());
        
        float percentualComissao;
        if (venda < 1000) {
            percentualComissao = 0.04f;
        } else if (venda <= 5000) {
            percentualComissao = 0.06f;
        } else {
            percentualComissao = 0.08f;
        }
        
        float comissao = venda * percentualComissao;
        
        System.out.println(String.format("Comissão (%.0f%%): R$ %.2f", percentualComissao * 100, comissao));
    }
}
