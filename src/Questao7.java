import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double venda,preco,percentual ,acrecimo;
        System.out.println("Digite o valor da venda: ");
        preco = sc.nextDouble();
        System.out.println("Digite percentual: ");
        percentual = sc.nextDouble();
        acrecimo= preco * percentual / 100;
        venda = preco + (preco * percentual / 100);
        System.out.println("O valor da venda é: " + venda + " e o acréscimo foi de: " + acrecimo);
    }
}
