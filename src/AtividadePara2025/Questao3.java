package AtividadePara2025;

import java.util.Scanner;
// - Imprima a soma de todos os números naturais entre um intervalo fornecido pelo usuário
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número inicial do intervalo: ");
        int inicio = sc.nextInt();
        System.out.println("Digite o número final do intervalo: ");
        int fim = sc.nextInt();

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
            soma += i;

        }

        System.out.println("A soma de todos os números naturais no intervalo é: " + soma);
    }
}