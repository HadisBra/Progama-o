package AtividadeMatriz;
/**
 *5. Faça um algoritmo que gere uma matriz (4 x 4) transposta (Matriz transposta é
 * toda a matriz onde são trocadas as linhas pelas colunas, ou vice-versa).
 * */
public class Questao5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizTransposta = new int[4][4];
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Gerando a matriz transposta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
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
        // Exibindo a matriz transposta
        System.out.println("Matriz trasportada:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
