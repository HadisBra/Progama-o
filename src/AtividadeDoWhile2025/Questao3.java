package AtividadeDoWhile2025;

import java.util.Scanner;

/**
 * Elabore um algoritmo para determinar o menor número inteiro fornecido pelo
 * usuário. Considere que o número zero indica o fim da entrada de dados.
 *
 * */
public class Questao3 {
    public static void main(String[] args) {
    int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        do {
            System.out.println(numero);
            numero--;
        } while (numero > -1);
    }
}
