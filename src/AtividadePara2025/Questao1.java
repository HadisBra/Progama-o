package AtividadePara2025;

/**
 * Imprimir os múltiplos de 3 com dois dígitos
 */
public class Questao1 {
    public static void main(String[] args) {
        int numero = 10;
        for (int i = 0; i < numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}