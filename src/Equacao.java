import java.util.Scanner;

public class Equacao {
    /**
     *Construa o fluxograma. algoritmo e programa em Java para calcular a equação do 2º Grau.
     * Leia as variáveis A, B e C, realize os cálculos e ao final informe a(s) raiz(es)
     * ou informe que não tem raízes reais, se for o caso.
     */

    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não tem raízes reais");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("A raiz é: " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: " + x1 + " e " + x2);
        }


    }
}
