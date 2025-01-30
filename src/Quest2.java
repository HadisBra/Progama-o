import java.util.Scanner;
/*
2 - Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.
*/
public class Quest2 {
    public static void main(String[] args) {
     int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("O primeiro número é maior que o segundo: "+num1);
        } else {
            System.out.println("O segundo número é maior que o primeiro: "+num2);
        }


    }
}
