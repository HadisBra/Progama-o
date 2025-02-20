package Dialogo;

import javax.swing.JOptionPane;
import java.util.Scanner;

///  Escreva um algoritmo que leia um conjunto de 20 números inteiros e mostre qual foi o
/// maior e o menor valor fornecido.
public class Questao1 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int[] numeros = new int[20];


        for (int i = 0; i < 20; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = Integer.parseInt(input);
        }
        for (int i = 0; i < 20; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Maior numero: "+maior);
        JOptionPane.showMessageDialog(null,"Menor numero: "+menor);

    }
}
