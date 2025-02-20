package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 3. Escreva um algoritmo que leia um conjunto de 20 números inteiros e mostre qual foi o
 * maior e o menor valor fornecido.
 */
public class Questao3 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int[] numeros = new int[20];
        Scanner src = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = src.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }
}
