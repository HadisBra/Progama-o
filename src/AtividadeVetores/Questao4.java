package AtividadeVetores;

/**
 * 4. Faça um algoritmo que informe após a leitura de um vetor com 10 posições, o maior e
 * o menor valor e suas respectivas posições.
 */
public class Questao4 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int maior = 0;
        int menor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }


        System.out.println("Maior valor: " + maior + " Posição: " + posicaoMaior);
        System.out.println("Menor valor: " + menor + " Posição: " + posicaoMenor);


    }
}
