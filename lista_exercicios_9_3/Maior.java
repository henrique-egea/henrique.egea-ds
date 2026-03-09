import java.util.Scanner;

// Exercício 2
public class Maior{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira um número: ");
                int nums[] = new int[2];
                nums[0] = Integer.parseInt(scanner.nextLine());
                System.out.println("Insira outro número: ");
                nums[1] = Integer.parseInt(scanner.nextLine());
                if(nums[0] < nums[1]){
                        System.out.println("O segundo número é maior");
                }
                else{
                        System.out.println("O primeiro número é maior");
                }
        }
}