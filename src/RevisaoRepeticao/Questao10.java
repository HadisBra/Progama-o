package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 5.Faça um algoritmo que receba vários números (0 – zero para sair), calcule e mostre:
 * •A soma dos números digitados
 * •A quantidade de números digitados
 * •A média dos números digitados
 * •O maior número digitado
 * •O menor número digitado
 */
public class Questao10 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        int quantidade = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        Scanner src = new Scanner(System.in);
        while (numero != 0) {
            System.out.println("Digite um número inteiro positivo: ");
            numero =src.nextInt();
            if (numero != 0) {
                soma += numero;
                quantidade++;
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A quantidade de números digitados é: " + quantidade);
        System.out.println("A média dos números digitados é: " + (soma / quantidade));
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);

    }
}
