import java.util.Scanner;

import static java.lang.System.out;



/**
 * 3) Um mercado fornece três tipos diferentes de ovos de Páscoa: pequenos (p ou P) com
 * valor unitário R$ 17,50; médios (m ou M) com valor unitário R$ 28,00; e grandes (g ou
 * G) com valor unitário R$ 39,50. Os pedidos dos clientes só podem conter ovos de um
 * mesmo tipo e, para satisfazer o maior número de clientes possível, o mercado
 * estabeleceu um máximo de ovos que pode ser requisitado por pedidos: o máximo de
 * ovos pequenos em um pedido é 50, de médios 30 e de grandes 20. Faça um programa
 * que leia os dados de um pedido e informe:
 *  O tipo de ovo solicitado: pequeno, médio ou grande.
 *  O número de unidades solicitadas ou informando que ultrapassou o
 *  limite permitido.
 *  O total a ser pago em reais.
 * Um pedido é dado por uma linha que começa com um caractere (p, P, m, M, g ou G)
 * indicando o tipo de ovo e um inteiro indicando a quantidade. Se o pedido ultrapassa o
 * máximo, deve imprimir uma mensagem indicando que não será possível atender o total
 * do pedido!
 */

public class Mercado {
    public static void main(String[] args) {
        String tipo;
        int quantidade;
        double total;
        Scanner src = new Scanner(System.in);
        out.println("Digite o tipo de ovo: ");
        out.println("p - Pequeno");
        out.println("m - Médio");
        out.println("g - Grande" + "\n" +
                "_____________________");
        tipo = src.nextLine().toLowerCase();
        out.println("_____________________");
        out.println("Digite a quantidade de ovos: " + "\n" +
                "P-50" + "\n" +
                "M-30" + "\n" +
                "G-20" + "\n" +
                "_____________________");
        quantidade = src.nextInt();
        out.println("_____________________");

        switch (tipo) {
            case "p":
                if (quantidade <= 50) {
                    total = quantidade * 17.50;
                    out.println("Tipo de ovo: Pequeno");
                    out.println("Quantidade: " + quantidade);
                    out.println("Total a ser pago: R$ " + total);
                } else {
                    out.println("Quantidade de ovos pequenos ultrapassou o limite permitido");
                }
                break;
            case "m":
                if (quantidade <= 30) {
                    total = quantidade * 28.00;
                    out.println("Tipo de ovo: Médio");
                    out.println("Quantidade: " + quantidade);
                    out.println("Total a ser pago: R$ " + total);
                } else {
                    out.println("Quantidade de ovos médios ultrapassou o limite permitido");
                }
                break;
            case "g":
                if (quantidade <= 20) {
                    total = quantidade * 39.50;
                    out.println("Tipo de ovo: Grande");
                    out.println("Quantidade: " + quantidade);
                    out.println("Total a ser pago: R$ " + total);
                } else {
                    out.println("Quantidade de ovos grandes ultrapassou o limite permitido");
                }
                break;
            default:
                out.println("Tipo de ovo inválido");
        }


    }
}
