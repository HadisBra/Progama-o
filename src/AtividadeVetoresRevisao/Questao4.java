package AtividadeVetoresRevisao;
/**
 * 4 – Faça um algoritmo que leia um código numérico inteiro e um vetor de 50 posições de números
 * reais. Se o código for 0 termine o algoritmo, se for 1, mostre o vetor na ordem direta, e se for 2,
 * mostre o vetor na ordem inversa
 * */
public class Questao4 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        for (int i = 0; i < 50; i++) {
            vetor[i] = i;
        }
        int codigo = 1;
        if (codigo == 0) {
        } else if (codigo == 1) {
            for (int i = 0; i < 50; i++) {
                System.out.println(vetor[i]);
            }
        } else if (codigo == 2) {
            for (int i = 49; i >= 0; i--) {
                System.out.println(vetor[i]);
            }
        }
    }
}
