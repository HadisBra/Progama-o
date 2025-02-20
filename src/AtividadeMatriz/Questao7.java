package AtividadeMatriz;
/**
 * 7. Escrever um algoritmo que lê uma matriz M (5 x 5) e cria 2 vetores SL(5) e SC(5) que
 * contenham, respectivamente, as somas das linhas e das colunas de M. Escrever a matriz
 * e os vetores criados.
 * */
public class Questao7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] somasLinhas = new int[5];
        int[] somasColunas = new int[5];
        // Preenchendo a matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Calculando as somas das linhas e das colunas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somasLinhas[i] += matriz[i][j];
                somasColunas[j] += matriz[i][j];
            }
        }
        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo as somas das linhas
        System.out.println("Somas das linhas:");
        for (int i = 0; i < somasLinhas.length; i++) {
            System.out.println("Linha " + i + ": " + somasLinhas[i]);
        }
        // Exibindo as somas das colunas
        System.out.println("Somas das colunas:");
        for (int i = 0; i < somasColunas.length; i++) {
            System.out.println("Coluna " + i + ": " + somasColunas[i]);
        }
    }
}
