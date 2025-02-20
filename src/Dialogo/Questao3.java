package Dialogo;

import javax.swing.JOptionPane;

/// Construa um algoritmo que verifique se um número fornecido pelo usuário é primo ou
/// não.
public class Questao3 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(numero);
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é primo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + num + " não é primo.");
        }
    }
}
