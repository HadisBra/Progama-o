package AtividadeMatriz;
/**
 * 2. Faça um algoritmo que leia uma matriz 3 x 4 de inteiros, substitua seus elementos
 * negativos por 0 e imprima a matriz original e a modificada.
 * */

public class Questao2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) - 5;
            }
        }
        // Exibindo a matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Substituindo os elementos negativos por 0
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
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
