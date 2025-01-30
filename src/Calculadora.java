import java.util.Scanner;

/**
 * 4. Faça um algoritmo que receba dois números, um operador
 * matemático (+,-,*,/) e efetue o cálculo matemático baseado no
 * operador digitado. O resultado deverá ser exibido em seguida.
 * */

public class Calculadora {
    public static void main(String[] args) {
        int num1,num2;
        char operador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Digite o operador: ");
        operador = sc.next().charAt(0);
        switch (operador){
            case '+':
                System.out.println("Resultado: "+(num1+num2));
                break;
            case '-':
                System.out.println("Resultado: "+(num1-num2));
                break;
            case '*':
                System.out.println("Resultado: "+(num1*num2));
                break;
            case '/':
                System.out.println("Resultado: "+(num1/num2));
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}
