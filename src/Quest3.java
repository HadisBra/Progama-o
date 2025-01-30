import java.util.Scanner;
/*
3 - Faça um algoritmo que receba um número e diga se este número está no intervalo
entre 100 e 200.
*/
public class Quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if(numero >=100 && numero <=200) {
            System.out.println("O número é maior ou igual a 100: " + numero);
        } else {
            System.out.println("O numero nao esta entre 100 e 200: "+numero);
        }

    }
}
