package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 5. Dado um limite inferior e superior, calcule a soma de todos os números pares contidos
 * nesse intervalo.
 */
public class Questao5 {
    public static void main(String[] args) {
        int limiteInferior=0;
        int limiteSuperior=0;
        int soma = 0;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite o limite inferior: ");
        limiteInferior = src.nextInt();
        System.out.println("Digite o limite superior: ");
        limiteSuperior = src.nextInt();

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma de todos os números pares entre " + limiteInferior + " e " + limiteSuperior + " é: " + soma);
    }
}
