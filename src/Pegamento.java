import java.util.Scanner;

/**
 * 1) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o
 * preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da
 * tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
 * adequado.
 * Código Condição de pagamento
 * 1 À vista em dinheiro ou cheque, recebe 10% de desconto
 * 2 À vista no cartão de crédito, recebe 15% de desconto
 * 3 Em duas vezes, preço normal de etiqueta sem juros
 * 4 Em duas vezes, preço normal de etiqueta mais juros de 10%
 */
public class Pegamento {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double preco, desconto, juros;
        int codigo;
        System.out.println("Digite o preço do produto: ");
        preco = src.nextDouble();
        System.out.println("Código -----------------Condição de pagamento" + "\n" +
                "    1  -----------------  À vista em dinheiro ou PIX, recebe 15% de desconto" + "\n" +
                "    2  -----------------  À vista no cartão de crédito, recebe 10% de desconto" + "\n" +
                "    3  -----------------  Em duas vezes no cartão, preço normal de etiqueta sem juros" + "\n" +
                "    4  -----------------  De 3 a 6 vezes no cartão, preço normal de etiqueta mais juros de 10%");
        System.out.println("Digite o código de pagamento: ");
        codigo = src.nextInt();
        switch (codigo) {
            case 1:
                desconto = preco * 0.15;
                System.out.println("O valor a ser pago no PIX é: " + (preco - desconto));
                break;
            case 2:
                desconto = preco * 0.10;
                System.out.println("O valor a ser pago no Cartão de Credito a vista é: " + (preco - desconto));
                break;
            case 3:
                System.out.println("O valor a ser pago Cartão de Credito em duas vezes sem juros  é: " + preco);
                break;
            case 4:
                juros = preco * 0.10;
                System.out.println("O valor a ser pago Cartão de Credito em 3 a 6 vezes com acréscimo  de 10% é: " + (preco + juros));
                break;
            default:
                System.out.println("Código inválido");
        }


    }
}
