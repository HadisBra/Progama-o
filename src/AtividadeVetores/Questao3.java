package AtividadeVetores;
/**
 * 3. Faça um algoritmo que realize a união de 2 vetores (10 posições) em um terceiro vetor
 * (C – 20 elementos).
 * **/


public class Questao3 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            vetorB[i] = i;
            vetorC[i] = vetorA[i];
            vetorC[i+10] = vetorB[i];
        }

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Vetor C: "+vetorC[i]);
        }


    }
}
