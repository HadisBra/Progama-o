import java.util.Scanner;

public class Questao4 {
    public  static  void main(String[] args){
        double Dolar, Real, Cotacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cotação do Dolar: ");
        Cotacao = sc.nextDouble();
        System.out.println("Digite quantos dolares você quer converter: ");
        Dolar = sc.nextDouble();
        Real = Dolar * Cotacao;
        System.out.println("Valor convertido em Real é: " + Real);


    }
}
