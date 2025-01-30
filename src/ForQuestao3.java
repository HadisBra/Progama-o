
import java.util.Scanner;

/**
 * Faça um algoritmo que lê número inteiros até que um número
 * negativo seja digitado;
 */
public class ForQuestao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; numero >= 0; i++) {
            System.out.println("Digite um número inteiro: ");
            numero = scanner.nextInt();
        }
    }
}