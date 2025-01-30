import java.util.Scanner;

import static java.lang.System.out;

/**
 * 4) Uma loja está fazendo liquidação e vendendo produtos com até 50% de desconto. O
 * desconto é identificado de acordo com a cor da etiqueta do produto:
 * Crie um algoritmo que leia o valor original do produto e a cor da etiqueta e informe
 * quanto o cliente irá pagar após a aplicação do desconto.
 */

public class Loja {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String cor;
        double preco, desconto;

        out.println("Digite o valor do produto: ");
        preco = src.nextDouble();

        out.println("Digite a cor da etiqueta: " + "\n" +
                "Azul" + "\n" +
                "Verde" + "\n" +
                "Amarelo" + "\n" +
                "Vermelho" + "\n" +
                "Laranja" + "\n" +
                "________________");
        cor = src.next().toLowerCase();
        switch (cor) {
            case "azul":
                desconto = preco * 0.10;
                out.println("O valor a ser pago é: " + (preco - desconto));
                break;
            case "verde":
                desconto = preco * 0.20;
                out.println("O valor a ser pago é: " + (preco - desconto));
                break;
            case "amarelo":
                desconto = preco * 0.30;
                out.println("O valor a ser pago é: " + (preco - desconto));
                break;
            case "vermelho":
                desconto = preco * 0.40;
                out.println("O valor a ser pago é: " + (preco - desconto));
                break;
            case "laranja":
                desconto = preco * 0.50;
                out.println("O valor a ser pago é: " + (preco - desconto));
                break;
            default:
                out.println("Cor inválida");
        }
    }
}
