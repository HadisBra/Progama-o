package AtividadeMatriz;

/**
 * 1. Faça um algoritmo para ler uma matriz M 5 x 5, calcular e escrever as seguintes somas:
 * a) da linha 3 de M
 * b) da coluna 2 de M
 * c) da diagonal principal
 * d) da diagonal secundária
 * e) de todos os elementos da matriz
 */
public class Questao1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int somaLinha3 = 0;
        int somaColuna2 = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int somaTotal = 0;

        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Calculando as somas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
                if (i == 2) {
                    somaLinha3 += matriz[i][j];
                }
                if (j == 1) {
                    somaColuna2 += matriz[i][j];
                }
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }
        // Exibindo a matriz e as somas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo as somas
        System.out.println("Soma da linha 3: " + somaLinha3);
        System.out.println("Soma da coluna 2: " + somaColuna2);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        System.out.println("Soma total: " + somaTotal);
    }
}
