package Dialogo;
import javax.swing.JOptionPane;
/// Faça um programa que informe o fatorial de um número
public class Questao4 {
    public static void main(String[] args) {
        int fatorial = 1;
        String numero = JOptionPane.showInputDialog("Digite um número inteiro:");
        int n = Integer.parseInt(numero);
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
    JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + fatorial);
    }
}
