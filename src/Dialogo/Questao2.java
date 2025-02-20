package Dialogo;

import javax.swing.JOptionPane;

/// João tem 1,50 m e cresce 2 cm por ano, enquanto Maria tem 1,10 m e cresce 3 cm por
/// ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para
/// que Maria seja maior que João.
public class Questao2 {
    public static void main(String[] args) {
        double alturaJoao = 1.50;
        double alturaMaria = 1.10;
        int anos = 0;
        while (alturaMaria <= alturaJoao) {
            alturaJoao += 0.02;
            alturaMaria += 0.03;
            anos++;
        }
        JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos para que Maria seja maior que João.");
    }
}
