package Atividade2025;

/**
 * 1 - O piloto de fórmula 1 Sebastian Vettel está liderando o campeonato com 78
 * pontos. O segundo colocado é o piloto Kimi Raikkonen com 35 pontos. Sabendo
 * que o líder não poderá mais correr a temporada por problemas de saúde e que
 * em cada prova o vencedor soma 12 pontos, construa um algoritmo que informe
 * quantas provas Raikkonen que ganhar para se tornar o Líder do Campeonato.
 * */

public class Questao1 {
    public static void main(String[] args) {
        int pontosVettel = 78;
        int pontosRaikkonen = 35;
        int pontosVitoria = 12;
        int provas = 0;

        while (pontosRaikkonen < pontosVettel) {
            pontosRaikkonen += pontosVitoria;
            provas++;
        }
        System.out.println("Raikkonen precisa vencer " + provas + " provas para se tornar líder do campeonato.");


    }

}
