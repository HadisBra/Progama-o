package RevisaoRepeticao;

import java.util.Scanner;

/**
 *4. Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura
 * e sexo (0=masc, 1=fem) das pessoas. Faça um programa que leia 50 dados diferentes e
 * informe:
 * • a maior e a menor altura encontradas
 * • a média de altura das mulheres
 * • a média de altura da população
 * • o percentual de homens na população
 * */
public class Questao14 {
    public static void main(String[] args) {
        int quantidade = 0;
        int i = 0;
        int altura, sexo;
        int maiorAltura = Integer.MIN_VALUE;
        int menorAltura = Integer.MAX_VALUE;
        int somaAlturaMulheres = 0;
        int quantidadeMulheres = 0;
        int somaAltura = 0;
        int quantidadeHomens = 0;
        Scanner src = new Scanner(System.in);

        while (quantidade < 50) {
            i++;
            System.out.println(i+" Digite a altura da pessoa em (CM): ");
            altura = src.nextInt();
            System.out.println("Digite o sexo da pessoa (0 para masculino e 1 para feminino): ");
            sexo = src.nextInt();
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo == 1) {
                somaAlturaMulheres += altura;
                quantidadeMulheres++;
            }
            somaAltura += altura;
            quantidade++;
        }
        System.out.println("A maior altura encontrada é: " + maiorAltura);
        System.out.println("A menor altura encontrada é: " + menorAltura);
        System.out.println("A média de altura das mulheres é: " + (somaAlturaMulheres / quantidadeMulheres));
        System.out.println("A média de altura da população é: " + (somaAltura / 50));
        System.out.println("O percentual de homens na população é: " + ((50 - quantidadeMulheres) / 50) * 100);

    }
}
