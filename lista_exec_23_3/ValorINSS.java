import java.util.Scanner;

// Exercício 9
public class ValorINSS {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o salário bruto: ");
        float salarioBruto = Float.parseFloat(scanner.nextLine());
        
        float aliquota;
        if (salarioBruto < 2000) {
            aliquota = 0.08f;
        } else if (salarioBruto <= 3000) {
            aliquota = 0.09f;
        } else {
            aliquota = 0.11f;
        }
        
        float descontoINSS = salarioBruto * aliquota;
        float salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println(String.format("Desconto INSS (%.0f%%): R$ %.2f", aliquota * 100, descontoINSS));
        System.out.println(String.format("Salário líquido: R$ %.2f", salarioLiquido));
    }
}
