import java.util.Scanner;

// Exercício 3
public class Positivo{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira um número: ");
                int num = Integer.parseInt(scanner.nextLine());
                if(num > 0){
                        System.out.println("Positivo");
                }
                else if (num < 0){
                        System.out.println("Negativo");
                }
                else {
                    System.out.println("Zero");
                }
        }
}