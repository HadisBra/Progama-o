import java.util.Scanner;

public class Quest5 {
    /*
* 5 - Faça um algoritmo que receba o nome a idade, o sexo e salário fixo de um funcionário.
Mostre o nome e o salário líquido:
Sexo Idade Abono
M >= 30 100,00
M < 30 50,00
F >= 30 200,00
F < 30 80,00
    * */
    public static void main(String[] args) {
        String nome, sexo;
        double salario, salarioLiquido;
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Digite o sexo do funcionário (m/f): ");
        sexo = sc.nextLine().toUpperCase();
        System.out.println("Digite a idade do funcionário: ");
        idade = sc.nextInt();
        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextDouble();

        if (sexo.equals("M") && idade >= 30) {
            salarioLiquido = salario + 100;
            System.out.println("O salário líquido do funcionário " + nome + " é: " + salarioLiquido);
        } else if (sexo.equals("M") && idade < 30) {
            salarioLiquido = salario + 50;
            System.out.println("O salário líquido do funcionário " + nome + " é: " + salarioLiquido);
        } else if (sexo.equals("F") && idade >= 30) {
            salarioLiquido = salario + 200;
            System.out.println("O salário líquido do funcionário " + nome + " é: " + salarioLiquido);
        } else {
            salarioLiquido = salario + 80;
            System.out.println("O salário líquido do funcionário " + nome + " é: " + salarioLiquido);
        }

    }
}
