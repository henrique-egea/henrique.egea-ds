import java.util.Scanner;

// Exercício 4
public class Media{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira o número de avaliações: ");
                int num_aval = Integer.parseInt(scanner.nextLine());
                float notas[] = new float[num_aval];
                // Loop para o usuário colocar as notas
                for(int i = 0; i < num_aval; i++){
                    System.out.println(String.format("Insira a %d nota", i + 1));
                    notas[i] = Float.parseFloat(scanner.nextLine());
                }
                float media = 0;
                // Soma as médias
                for(int i = 0; i < num_aval; i++){
                    media = media + notas[i];
                }
                media = media / num_aval;
                System.out.println(String.format("Nota do aluno: %.2f", media));
                if(media > 7 ){
                        System.out.println("Passou");
                }
                else if(media >= 5 && media <= 7){
                        System.out.println("De recuperação");
                }
                else{
                    System.out.println("Reprovou");
                }

        }
}