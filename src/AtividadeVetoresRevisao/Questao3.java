package AtividadeVetoresRevisao;
/**
 * 3 – Escreva um algoritmo que leia um vetor G de 20 elementos literais que representa o gabarito de
 * uma prova. A seguir para cada um dos 50 alunos da turma, leia o vetor de respostas R do aluno.
 * Mostre o número de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a
 * 6; e uma mensagem de REPROVADO, caso contrário
 * */
public class Questao3 {
    public static void main(String[] args) {
        String[] gabarito = new String[20];
        for (int i = 0; i < 20; i++) {
            gabarito[i] = "A";
        }
        String[] respostas = new String[50];
        for (int i = 0; i < 50; i++) {
            int acertos = 0;
            for (int j = 0; j < 20; j++) {
                if (gabarito[j].equals(respostas[j])) {
                    acertos++;
                }
            }
            if (acertos >= 6) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        }
    }
}
