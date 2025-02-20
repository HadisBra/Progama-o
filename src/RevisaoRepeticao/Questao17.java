package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 2. Faça um programa que informe o fatorial de um número.
 * */
public class Questao17 {
    public static void main(String[] args) {
        int n = 0;
        int fatorial =1;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = src.nextInt();
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}
