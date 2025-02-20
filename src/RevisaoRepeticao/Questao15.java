package RevisaoRepeticao;
/**
 * 5. Faça um programa que exiba na tela a tabuada completa (de 1x1=1 até 10x10=100).
 * */
public class Questao15 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Tabuada de multiplicação de 1 a 10");
        while (i <= 10) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            i++;
        }

    }
}
