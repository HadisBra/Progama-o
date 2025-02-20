package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 2. Faça um algoritmo que leia um número N, some todos os números inteiros de 1 a N, e
 * mostre o resultado obtido.
 */
public class Questao2 {
    public static void main(String[] args) {

        int numeroN, soma = 0;

        Scanner src = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        numeroN = src.nextInt();

        for (int i = 0; i < numeroN; i++) {
            soma += i;
            System.out.println("Soma parcial: " + soma);
        }
        System.out.println("A soma de todos os números inteiros de 1 a " + numeroN + " é: " + soma);

    }
}
