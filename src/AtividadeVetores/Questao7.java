package AtividadeVetores;
            /**
             * 7. Faça um algoritmo que após a leitura de um vetor de 10 posições informe a soma total,
             * média, maior e menor valor.
             * */
            public class Questao7 {
                public static void main(String[] args) {

                    int[] vetor = new int[10];
                    int soma = 0;
                    int maior = 0;
                    int menor = 0;

                    for (int i = 0; i < vetor.length; i++) {
                        vetor[i] = i;
                        soma += vetor[i];
                        if (i == 0) {
                            maior = vetor[i];
                            menor = vetor[i];
                        }
                        if (vetor[i] > maior) {
                            maior = vetor[i];
                        }
                        if (vetor[i] < menor) {
                            menor = vetor[i];
                        }
                    }

                    double media = (double) soma / vetor.length;

                    System.out.println("Soma total: " + soma);
                    System.out.println("Média: " + media);
                    System.out.println("Maior valor: " + maior);
                    System.out.println("Menor valor: " + menor);
                }
            }