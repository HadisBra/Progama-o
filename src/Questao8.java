import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        double valorConsumidor,custoFabrica,distribuidor;
        int inpostoFabrica = 45,inpostoDistribuidor = 28;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o custo de fabrica do carro: ");
        custoFabrica = sc.nextDouble();
        distribuidor = custoFabrica * inpostoFabrica / 100;
        System.out.println("O valor do distribuidor é: " + distribuidor);

        valorConsumidor = custoFabrica + distribuidor + (custoFabrica * inpostoDistribuidor / 100);
        System.out.println("O valor do carro para o consumidor é: " + valorConsumidor);


    }
}
