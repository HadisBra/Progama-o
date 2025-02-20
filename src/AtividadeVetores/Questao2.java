package AtividadeVetores;
/**
 * 2. Faça um algoritmo que leia dois vetores A e B (10 posições), multiplique cada elemento
 * correspondente entre os dois vetores e armazene em um vetor C.
 *
 * */
public class Questao2 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            vetorB[i] = i;
            vetorC[i] = vetorA[i] * vetorB[i];
            System.out.println("Vetor C:" + vetorC[i]);
        }



    }
}
