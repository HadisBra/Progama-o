import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        String Nome;
        double Nota1, Nota2, Nota3, Media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Notas do Aluno");
        System.out.println("Digite o nome do aluno: ");
        Nome = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        Nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Nota3 = sc.nextDouble();
        Media = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println("A média do aluno " + Nome + " é: " + Media);



    }
}
