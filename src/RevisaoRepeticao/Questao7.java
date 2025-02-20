package RevisaoRepeticao;
/**
 * 2. Chicão tem 1,50 m e cresce 2 cm por ano, enquanto Bruno tem 1,10 m e cresce 3 cm
 * por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários
 * para que Bruno seja maior que Chicão.
 * */
public class Questao7 {
    public static void main(String[] args) {
        double alturaChicao = 1.50;
        double alturaBruno = 1.10;
        int anos = 0;
        while (alturaBruno <= alturaChicao) {
            alturaChicao += 0.02;
            alturaBruno += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Bruno seja maior que Chicão.");
    }
}
