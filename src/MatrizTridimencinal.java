public class MatrizTridimencinal {
    public static void main(String[] args) {
        ///  matriz tridimencional profundidade, linha, coluna
        int matriz[][][] = new int[3][2][4];
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {//profundidade
            for (int j = 0; j < matriz[i].length; j++) {//linha
                for (int k = 0; k < matriz[i][j].length; k++) {//coluna
                    matriz[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {//profundidade
            for (int j = 0; j < matriz[i].length; j++) {//  linha
                for (int k = 0; k < matriz[i][j].length; k++) {//coluna
                    System.out.print(matriz[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
     int soma=0;
        // Calculando a soma dos elementos da matriz
        for (int i = 0; i < matriz.length; i++) {//profundidade
            for (int j = 0; j < matriz[i].length; j++) {//linha
                for (int k = 0; k < matriz[i][j].length; k++) {//coluna
                    soma += matriz[i][j][k];
                }
            }
        }

        System.out.println("Soma dos elementos da matriz: " + soma);
    }
}
