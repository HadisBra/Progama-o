import java.util.Scanner;

/**
 * Faça um algoritmo que lê a idade de 15 pessoas e mostre a
 * quantidade de pessoas que possui a idade entre 0 e 12 anos
 **/

public class ForQuestao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        int quantidade = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade da pessoa: ");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 12) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de pessoas com idade entre 0 e 12 anos: " + quantidade);
    }
}
