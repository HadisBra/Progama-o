package AtividadeMatriz;
/**
 *3. Desenvolva um algoritmo que leia uma matriz 4 x 5 de inteiros. Em seguida,
 * calcule a soma dos elementos de cada coluna, armazenando o resultado da soma em um
 * vetor de 5 elementos.
 * */
public class Questao3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        int[] somaColunas = new int[5];
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Calculando a soma das colunas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        // Exibindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo a soma das colunas
        for (int i = 0; i < somaColunas.length; i++) {
            System.out.println("Soma da coluna " + i + ": " + somaColunas[i]);
        }
    }
}
