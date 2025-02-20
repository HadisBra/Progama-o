package AtividadeVetores;
/**
 * 6. Faça um algoritmo que insira todos os elementos de vetor A (10 posições) em um vetor
 * B em ordem inversa de posições em que foram inseridos no primeiro vetor.
 * */
public class Questao6 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            vetorB[vetorB.length - 1 - i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor B: "+vetorB[i]);
        }
    }
}
