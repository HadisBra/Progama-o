package AtividadeMatriz;

/**
 * 4. Faça um algoritmo que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
 * Em seguida o algoritmo deve fazer a multiplicação do vetor p elas colunas da matriz.
 */
public class Questao4 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int vetor[] = new int[3];
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Preenchendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }
        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo o vetor
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        // Multiplicando o vetor pelas colunas da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] *= vetor[j];
            }
        }
        // Exibindo a matriz modificada
        System.out.println("Matriz modificada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
