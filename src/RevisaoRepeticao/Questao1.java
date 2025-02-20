package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 1. Faça um algoritmo que imprima todos os números inteiros de 1 a N (fornecido pelo
 * usuário).
 * */
public class Questao1 {
    public static void main(String[] args) {
        int userNumber;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        userNumber = src.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            System.out.println(i);
        }
    }
}
