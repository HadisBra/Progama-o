package RevisaoRepeticao;
/**
 * USANDO O “REPITA”
 * 1. Faça um algoritmo que leia uma lista de números inteiros positivos terminada pelo
 * número 0 (zero). Ao final, o algoritmo deve mostrar a média aritmética de todos os
 * números lidos excluindo o zero).
 * */
public class Questao6 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        int quantidade = 0;
        while (numero != 0) {
            System.out.println("Digite um número inteiro positivo: ");
            numero = new java.util.Scanner(System.in).nextInt();
            if (numero != 0) {
                soma += numero;
                quantidade++;
            }
        }
        System.out.println("A média aritmética dos números lidos é: " + (soma / quantidade));


    }
}
