import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C,F;
        System.out.println("Digite a temperatura em Celsius: ");
        C = sc.nextInt();
        F = (9 * C + 160) / 5;
        System.out.println("A temperatura em Fahrenheit é: " + F);
    }
}
