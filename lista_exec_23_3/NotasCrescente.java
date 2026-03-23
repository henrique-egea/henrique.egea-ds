import java.util.Scanner;

// Exercício 11
public class NotasCrescente {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota: ");
        float nota1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira a segunda nota: ");
        float nota2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Insira a terceira nota: ");
        float nota3 = Float.parseFloat(scanner.nextLine());
        
        float menor, medio, maior;
        
        if (nota1 <= nota2 && nota1 <= nota3) {
            menor = nota1;
            if (nota2 <= nota3) {
                medio = nota2;
                maior = nota3;
            } else {
                medio = nota3;
                maior = nota2;
            }
        } else if (nota2 <= nota1 && nota2 <= nota3) {
            menor = nota2;
            if (nota1 <= nota3) {
                medio = nota1;
                maior = nota3;
            } else {
                medio = nota3;
                maior = nota1;
            }
        } else {
            menor = nota3;
            if (nota1 <= nota2) {
                medio = nota1;
                maior = nota2;
            } else {
                medio = nota2;
                maior = nota1;
            }
        }
        
        System.out.println("Ordem crescente: " + menor + ", " + medio + ", " + maior);
    }
}
