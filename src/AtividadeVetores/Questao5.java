package AtividadeVetores;

        import java.util.Scanner;

        /**
         * 5. Faça um algoritmo que busque em um vetor com 10 posições um determinado valor
         * digitado pelo usuário. O algoritmo deve retornar se o valor se encontra no vetor e caso
         * positivo informar também a posição o mesmo está localizado.
         * */
        public class Questao5 {
            public static void main(String[] args) {
                int[] vetor = new int[10];
                boolean achou = false;
                int posicao = -1;
                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < vetor.length; i++) {
                    vetor[i] = i;
                }

                System.out.println("Digite um valor para buscar no vetor: ");
                int valor = scanner.nextInt();

                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] == valor) {
                        achou = true;
                        posicao = i;
                        break;
                    }
                }

                if (achou) {
                    System.out.println("Valor encontrado na posição: " + posicao);
                } else {
                    System.out.println("Valor não encontrado no vetor");
                }
            }
        }