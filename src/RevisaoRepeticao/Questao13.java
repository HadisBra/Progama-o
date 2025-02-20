package RevisaoRepeticao;

import java.util.Scanner;

/**
 * 3. Faça um programa que calcule o retorno de um investimento financeiro fazendo as
 * contas mês a mês, sem usar a fórmula de juros compostos
 * */
public class Questao13 {
    public static void main(String[] args) {
        double investimento =0;
        double taxa = 0.01;
        int meses = 1;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite o valor do investimento: ");
        investimento = src.nextDouble();
        while (meses < 12) {
            investimento += investimento * taxa;
            System.out.println("Mês: " + meses + " - R$ " + investimento);
            meses++;
        }

       System.out.printf("O investimento após 12 meses será de R$ %.2f com uma taxa de 1%% ao mês.%n", investimento);

    }
}
