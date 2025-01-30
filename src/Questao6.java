import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco,valores;
        int prestacoes=5;
        System.out.println("Digite o valor do produto: ");
        preco = sc.nextDouble();
        valores = preco / prestacoes;
        System.out.println("O valor de cada prestação é: " + valores);


    }
}
