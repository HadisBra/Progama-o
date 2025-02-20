package AtividadeVetoresRevisao;
/**
 * 2 – Ler um vetor v de 10 elementos inteiros e obter um vetor fat cujos componentes são os fatoriais
 * dos respectivos componentes de v.
 * */
public class Questao2 {
    public static void main(String[] args) {
        int[] v = new int[10];
        int[] fat = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = i;
            fat[i] = fatorial(v[i]);
            System.out.println(fat[i]);
        }
    }

    private static int fatorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * fatorial(i - 1);
    }
}
