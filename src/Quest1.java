import java.util.Scanner;
/*
1 - Faça um algoritmo que receba um número e mostre uma mensagem caso este número
seja maior que 10.

* */
public class Quest1 {
    public static void main(String[] args) {
    int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        if (numero > 10) {
            System.out.println("O número é maior que 10: "+numero);
        } else {
            System.out.println("O número é menor que 10: "+numero);
        }

    }
}
