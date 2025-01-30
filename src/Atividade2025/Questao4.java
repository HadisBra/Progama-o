package Atividade2025;

import java.util.Scanner;

/**
 * Achar o maior e o menor número de uma série de números positivos
 * fornecidos pelo usuário.
 * */
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,n4,cont = 0;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        n4 = sc.nextInt();

        while (cont < 1) {
            if (n1 > n2 && n1 > n3 && n1 > n4) {
                System.out.println("O maior número é: " + n1);
            } else if (n2 > n1 && n2 > n3 && n2 > n4) {
                System.out.println("O maior número é: " + n2);
            } else if (n3 > n1 && n3 > n2 && n3 > n4) {
                System.out.println("O maior número é: " + n3);
            } else {
                System.out.println("O maior número é: " + n4);
            }
            if (n1 < n2 && n1 < n3 && n1 < n4) {
                System.out.println("O menor número é: " + n1);
            } else if (n2 < n1 && n2 < n3 && n2 < n4) {
                System.out.println("O menor número é: " + n2);
            } else if (n3 < n1 && n3 < n2 && n3 < n4) {
                System.out.println("O menor número é: " + n3);
            } else {
                System.out.println("O menor número é: " + n4);
            }
            cont++;
        }



    }
}
