package RevisaoRepeticao;
/**
 * 4. Imprima uma tabela de conversão de polegadas para centímetros, de 1 a 20. Considere
 * que Polegada = Centímetro * 2,54.
 * */
public class Questao4 {
    public static void main(String[] args) {
        System.out.println("Polegadas | Centímetros");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " | " + i * 2.54);
        }

    }
}
