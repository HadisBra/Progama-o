package RevisaoRepeticao;
/**2. Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200
*/
 public class Questao12 {
    public static void main(String[] args) {
        int numero = 100;
        int numero2 = 200;
        while (numero <= numero2) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }

    }
}
