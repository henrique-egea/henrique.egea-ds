import java.util.Scanner;

// Exercício 5
public class Aumento{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira o salário: ");
                double salario = Double.parseDouble(scanner.nextLine());
                if(salario < 2000){
                        salario = salario + (salario * 0.10);
                        System.out.println(String.format("Novo Salário: %.2f", salario));
                }
                else if(salario >= 2000 && salario < 4000){
                    salario = salario + (salario * 0.07);
                    System.out.println(String.format("Novo Salário: %.2f", salario));

                }
                else {
                    salario = salario + (salario + 0.05);
                    System.out.println(String.format("Novo Salário: %.2f", salario));
                }
        }
}