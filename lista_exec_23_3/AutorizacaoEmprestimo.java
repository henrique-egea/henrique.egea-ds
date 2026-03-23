import java.util.Scanner;

// Exercício 8
public class AutorizacaoEmprestimo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o salário: ");
        float salario = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira o valor da parcela: ");
        float parcela = Float.parseFloat(scanner.nextLine());
        
        float limiteParcela = salario * 0.30f;
        
        if (parcela <= limiteParcela) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo negado");
        }
    }
}
