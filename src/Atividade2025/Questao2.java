package Atividade2025;

import java.util.Scanner;

/***
 * Entrar com as duas notas (1AV e 2AV) de N alunos da turma e mostre para
 * cada aluno, o seu nome, a sua média e a sua situação (aprovado ou recuperação).
 */

public class Questao2 {
    public static void main(String[] args) {
        int alunos=0;
        double nota1=0, nota2=0, media=0;
        String nome="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        alunos = sc.nextInt();
        sc.nextLine();

        while (alunos > 0) {
            System.out.println("Digite o nome do aluno: ");
            nome = sc.nextLine();
            System.out.println("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = sc.nextDouble();
            media = (nota1 + nota2) / 2;
            if (media >= 7) {
                System.out.println("O aluno " + nome + " foi aprovado com média " + media);
            } else {
                System.out.println("O aluno " + nome + " foi reprovado com média " + media);
            }
            alunos--;
            sc.nextLine();
        }


    }
}
