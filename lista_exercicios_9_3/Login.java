import java.util.Scanner;

// Exercício 16
public class Login {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Insira a senha: ");
        String senha = scanner.nextLine();
        
        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
