import java.util.Scanner;

public class Triangulo {
    /***
     * Construa o fluxograma. algoritmo e programa em Java para testar o triângulo.
     * Leia os três lados, teste se é triângulo. Se for, informe o seu tipo (equilátero, isósceles ou escaleno).
     *
     */

    public static void main(String[] args) {
        int lado1,lado2,lado3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        lado1 = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        lado2 = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        lado3 = sc.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

    }
}
