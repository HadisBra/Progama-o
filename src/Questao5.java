import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        double deposito,rendimento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        deposito = sc.nextDouble();
        rendimento = deposito * 0.70;
        System.out.println("O rendimento do Mês Foi de : " + rendimento);
        System.out.println("Saldo Total do deposito mais o redimento é: " + (deposito + rendimento));

    }
}
