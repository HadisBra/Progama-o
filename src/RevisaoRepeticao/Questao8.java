package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 3. Construa um algoritmo que verifique se um número fornecido pelo usuário é primo ou
 * não.
 * */
public class Questao8 {
    public static void main(String[] args) {
        int numero=0;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        numero = src.nextInt();

        while (numero < 0) {
            System.out.println("Digite um número inteiro positivo: ");
            numero = src.nextInt();
        }
        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            int divisores = 0;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 0) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }


    }
}
