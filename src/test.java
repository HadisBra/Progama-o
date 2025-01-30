import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1,n2,n3,media;
    String nome,situacao;
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        media=(n1+n2+n3)/3;
        if (media>=7){
            situacao="Aprovado";
            }else{
            situacao="Reprovado";
            }

        System.out.println("A média do aluno " + nome + " é: " + media);
        System.out.println("Situação do aluno: " + situacao);
        }
    }


