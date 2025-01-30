package AtividadePara2025;
//- Construa um programa que calcule o soma de uma sequência de números
//introduzidos pelo utilizador. O programa deve solicitar o tamanho da sequencia
//ao utilizador.
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da sequência: ");
        int tamanho = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número: ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        System.out.println("A soma da sequência é: " + soma);
        System.out.println("A média da sequência é: " + (soma / tamanho));
    }
}