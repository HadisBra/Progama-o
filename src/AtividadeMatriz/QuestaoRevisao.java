package AtividadeMatriz;
/**
 * Jogo da Quadra.
 * - Informe o valor do prêmio;
 * - Informe 10 cartelas com números de 1 a 60, contendo 4 números cada cartela;
 * - Informe os 4 números sorteados;
 * - Informe quantas cartelas foram premiadas;
 * - Informe o valor do prêmio a cada ganhador.
 * */
public class QuestaoRevisao {
    public static void main(String[] args) {
        int premio = 1000;
        int[][] cartelas = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32},
                {1, 2, 3, 4},
                {37, 38, 39, 40}
        };
        int[] sorteados = {1, 2, 3, 4};
        int cartelasPremiadas = 0;
        for (int i = 0; i < cartelas.length; i++) {
            int acertos = 0;
            for (int j = 0; j < cartelas[i].length; j++) {
                for (int k = 0; k < sorteados.length; k++) {
                    if (cartelas[i][j] == sorteados[k]) {
                        acertos++;
                    }
                }
            }
            if (acertos == 4) {
                cartelasPremiadas++;
            }
        }
        System.out.println("Sorteados: " + sorteados[0] + ", " + sorteados[1] + ", " + sorteados[2] + ", " + sorteados[3]);
        System.out.println("Valor do prêmio: R$" + premio);
        System.out.println("Cartelas premiadas: " + cartelasPremiadas);
        System.out.println("Valor do prêmio a cada ganhador: R$" + (premio / cartelasPremiadas));
    }
}
