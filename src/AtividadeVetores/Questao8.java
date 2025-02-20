package AtividadeVetores;
/**
 *  Faça um algoritmo que após a leitura de um vetor de 10 posições informe quantos
 * elementos são pares e quantos são ímpares.
 * */
public class Questao8 {

    public static void main(String[] args) {

        int[] vetor = new int[11];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + impares);


    }
}
