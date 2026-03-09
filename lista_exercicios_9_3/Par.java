import java.util.Scanner;

// Exercício 1
public class Par{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira um número: ");
                int num = Integer.parseInt(scanner.nextLine());
                if(num % 2 == 0){
                        System.out.println("Par");
                }
                else{
                        System.out.println("Impar");
                }
        }
}