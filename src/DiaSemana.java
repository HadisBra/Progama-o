/*
1. Faça um algoritmo que lê um número de 1 a 7 e informa o dia da
semana correspondente, sendo domingo o número 1. Caso o número
não corresponder a um dia da semana, é exibida uma mensagem de
erro;
*/

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        int dia;
        Scanner src = new Scanner(System.in);

        System.out.print("Digite um dia da Semana: ");
        dia = src.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }
    }
}