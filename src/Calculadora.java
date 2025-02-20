import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 4. Faça um algoritmo que receba dois números, um operador
 * matemático (+,-,*,/) e efetue o cálculo matemático baseado no
 * operador digitado. O resultado deverá ser exibido em seguida.
 */

public class Calculadora {
    public static void main(String[] args) {
        char operador;
        Scanner sc = new Scanner(System.in);
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        int num1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        int num2 = Integer.parseInt(input2);
        String input3 = JOptionPane.showInputDialog("Digite o operador (+,-,*,/): ");
        operador = input3.charAt(0);
        switch (operador) {
            case '+':
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2));

                 break;
            case '-':
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2));
                break;
            case '*':
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2));
                break;
            case '/':
                JOptionPane.showMessageDialog(null, "Resultado: " + (num1 / num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador inválido!");
                break;
        }
    }
}
