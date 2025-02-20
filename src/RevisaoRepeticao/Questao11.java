package RevisaoRepeticao;

import java.util.Scanner;

/**
 * USANDO O “ENQUANTO”
 * 1. Faça um algoritmo estruturado que leia uma quantidade não determinada de números
 * positivos. Calcule a quantidade de números pares e ímpares, a média de valores pares e a
 * média geral dos números lidos. O número que encerrará a leitura será zero.
 */
public class Questao11 {
    public static void main(String[] args) {
        int numero = 1;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int somaPares = 0;
        int somaGeral = 0;
        Scanner src = new Scanner(System.in);
        while (numero != 0) {
            System.out.println("Digite um número inteiro positivo: ");
            numero = src.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    quantidadePares++;
                    somaPares += numero;
                } else {
                    quantidadeImpares++;
                }
                somaGeral += numero;
            }
        }

        System.out.println("A quantidade de números pares é: " + quantidadePares);
        System.out.println("A quantidade de números ímpares é: " + quantidadeImpares);
        System.out.println("A média dos valores pares é: " + (somaPares / quantidadePares));
        System.out.println("A média geral dos números lidos é: " + (somaGeral / (quantidadePares + quantidadeImpares)));

    }
}
