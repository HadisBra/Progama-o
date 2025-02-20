package RevisaoRepeticao;
/**
 * 4. A conversão de graus Fahrenheit para centígrado s e obtida pela fórmula C = 5/9 (F −
 * 32). Escreva um algoritmo que calcule e escreva uma tabela de graus centígrados em
 * função de graus Fahrenheit que variem de 50 a 150 de 1 em 1.
 * */
public class Questao9 {
    public static void main(String[] args) {
        System.out.println("F° | C°");
        while (true) {
            for (int i = 50; i <= 150; i++) {
                System.out.println(i + " | " + (5.0 / 9.0) * (i - 32));
            }
            break;

        }
    }
}