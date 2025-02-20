package AtividadeMatriz;
/**
 *6. Faça um algoritmo que faça a soma de duas matrizes (4 x 4).
 *
 * */
public class Questao6 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matrizSoma = new int[4][4];
        // Preenchendo as matrizes
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        // Somando as matrizes
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        // Exibindo a matriz 1
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo a matriz 2
        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo a matriz soma
        System.out.println("Matriz soma:");
        for (int i = 0; i < matrizSoma.length; i++) {
            for (int j = 0; j < matrizSoma[i].length; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
