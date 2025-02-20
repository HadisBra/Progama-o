package AtividadeVetoresRevisao;
/**
 * 1 – Leia dois vetores inteiros de 50 posições, some seus correspondentes elementos e imprima o
 * resultado da soma.
 * */
public class Questao1 {
    public static void main(String[] args) {
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        int[] vetorSoma = new int[50];
        for (int i = 0; i < 50; i++) {
            vetor1[i] = i;
            vetor2[i] = i;
            vetorSoma[i] = vetor1[i] + vetor2[i];
            System.out.println(vetorSoma[i]);
        }
    }
}
