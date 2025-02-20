package AtividadeMatriz;
/**
 * 8. Faça um algoritmo que leia uma matriz (5 x 5) de números e encontre o maior, menor
 * e média dos valores da matriz.
 * */
public class Questao8 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Encontrando o maior, o menor e a soma dos valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                soma += matriz[i][j];
            }
        }
        // Calculando a média
        double media = (double) soma / (matriz.length * matriz[0].length);
        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Exibindo o maior, o menor e a média
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);

    }
}
